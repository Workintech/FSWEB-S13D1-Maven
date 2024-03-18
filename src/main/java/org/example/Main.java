package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (!isBarking || clock < 0 || clock > 23) {
            return false;
        } else if (clock < 8 || clock >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = (isSummer) ? 45 : 35;
        return (temp >= 25 && temp <= upperLimit);
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
