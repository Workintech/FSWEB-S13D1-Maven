package org.example;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ResultAnalyzer implements TestWatcher, AfterAllCallback {
    private List<TestResultStatus> testResultsStatus = new ArrayList<>();
    private static final String taskId = "138";

    private enum TestResultStatus { SUCCESSFUL, FAILED, DISABLED, ABORTED; }

    @Override public void testDisabled(ExtensionContext c, Optional<String> r) { testResultsStatus.add(TestResultStatus.DISABLED); }
    @Override public void testSuccessful(ExtensionContext c) { testResultsStatus.add(TestResultStatus.SUCCESSFUL); }
    @Override public void testAborted(ExtensionContext c, Throwable t) { testResultsStatus.add(TestResultStatus.ABORTED); }
    @Override public void testFailed(ExtensionContext c, Throwable t) { testResultsStatus.add(TestResultStatus.FAILED); }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        Map<TestResultStatus, Long> summary = testResultsStatus.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long success = summary.getOrDefault(TestResultStatus.SUCCESSFUL, 0L);
        long failure = summary.getOrDefault(TestResultStatus.FAILED, 0L);
        double score = (success + failure == 0) ? 0 : (double) success / (success + failure);

        String userId = "307446"; // Güncellenen ID

        JSONObject json = new JSONObject();
        json.put("score", score);
        json.put("taskId", taskId);
        json.put("userId", userId);
        sendTestResult(json.toString());
    }

    private void sendTestResult(String result) throws IOException {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpPost request = new HttpPost("https://coursey-gpt-backend.herokuapp.com/nextgen/taskLog/saveJavaTasks");
            request.addHeader("content-type", "application/json");
            request.setEntity(new StringEntity(result));
            httpClient.execute(request);
        } catch (Exception e) { e.printStackTrace(); }
    }
}