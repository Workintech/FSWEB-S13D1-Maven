package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (!isBarking) {
            return false;
        }
        if (clock < 8 || clock >= 20) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (!isSummer && temp > 25 && temp <= 35) {
            return true;
        } else if (isSummer &&  temp > 25 && temp < 45) {
            return true;
        } else {
        return false;
        }
    }

    public static double area(double width, double height) {
       double alan = width * height;
       if (width > 0 && height > 0) {
           return alan;
       } else {
           return -1;
       }
    }

    public static double area(double radius) {
       if (radius > 0) {
           return radius * radius * Math.PI;
       } else {
           return -1;
       }
    }
}
