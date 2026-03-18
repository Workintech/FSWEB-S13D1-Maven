package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println(area(5.0));
        System.out.println(area(-1));
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay >= 20);
    }


    public static boolean hasTeen(int a, int b, int c) {

        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }


    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            return temperature >= 25 && temperature <= 45;
        }

        return temperature >= 25 && temperature <= 35;
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
