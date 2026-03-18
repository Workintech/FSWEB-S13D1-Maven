package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Havlayan Köpek ---");
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false

        System.out.println("\n--- Yaş Tespiti ---");
        System.out.println(hasTeen(9, 99, 19));  // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        System.out.println("\n--- Oyuncu Kedi ---");
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true

        System.out.println("\n--- Alan Hesaplama ---");
        System.out.println(area(5.0, 4.0)); // 20.0
        System.out.println(area(-1.0, 4.0)); // -1.0
        System.out.println(area(5.0));      // 78.53981633974483
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        // Geçersiz saat kontrolü
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int maxTemp = isSummer ? 45 : 35; // Yaz ise max sıcaklık 45, değilse 35
        return temperature >= 25 && temperature <= maxTemp;
    }



    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}