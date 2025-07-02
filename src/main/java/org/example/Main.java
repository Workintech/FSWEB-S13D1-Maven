package org.example;

public class Main {
    public static void main(String[] args) {




        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock < 8 || clock > 20) {
            isBarking = true;
        }else {
            isBarking = false;
        }

        return isBarking;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if(firstAge >= 13 && firstAge <= 19 &&
                secondAge >= 13 && secondAge <= 19 &&
                thirdAge >= 13 && thirdAge <= 19) {
            return true;
        }else{

            return false;
        }

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }

    }

    public static double area(double width, double height) {

        if(width > 0 && height > 0) {

            return width * height;

        }else {

            return -1 ;

        }

    }

    public static double area(double radius) {

        if(radius > 0) {
            return radius*radius*Math.PI ;
        }else{
            return -1 ;
        }

    }
}
