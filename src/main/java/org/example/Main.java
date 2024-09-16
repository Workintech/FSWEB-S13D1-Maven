package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (isBarking && (clock < 8 || clock > 20)) {
            return true;
        } else {
            return false;
        }
    }

    // yardımcı method
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (temp < 25) {
            return false;
        }
        return isSummer ? temp <= 45 : temp <= 35;
    }

    public static double area(double width, double height) {
       if(width<0||height<0) return -1;
       return width*height;
    }

    public static double area(double radius) {
       if(radius < 0) return -1;
       return radius*radius*Math.PI;
    }
}
