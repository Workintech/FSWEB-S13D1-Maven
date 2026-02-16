package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Köpek Testi: " + shouldWakeUp(true, 1));
        System.out.println("Yaş Testi: " + hasTeen(9, 99, 19));
        System.out.println("Kedi Testi: " + isCatPlaying(false, 36));
    }

    // 1. Havlayan Köpek
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        return isBarking && (clock < 8 || clock >= 20);
    }

    // 2. Yaş Tespiti
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    // 3. Oyuncu Kedi
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // 4. Dikdörtgen Alanı
    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1.0;
        return width * height;
    }

    // 5. Daire Alanı
    public static double area(double radius) {
        if (radius < 0) return -1.0;
        return radius * radius * Math.PI;
    }
}