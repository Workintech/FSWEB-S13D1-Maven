package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        boolean result =  false;
        if (isBarking) {
            if(clock < 0 || clock > 23) {
                result = false;
            } else if(clock >= 0 && clock < 8) {
                result = true;
            } else if(clock >= 8 && clock <= 20) {
                result = false;
            } else {
                result = true;
            }
        } else {
            result = false;
        }

        return result;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean result = false;
        if(isSummer) {
           if(temp >= 25 && temp <= 45) {
               result = true;
           } else {
               result = false;
           }
        } else {
            if(temp >= 25 && temp <= 35) {
                result = true;
            } else {
                result = false;
            }
        }
     return result;
    }

    public static double area(double width, double height) {
        double area = 0;
       if(width > 0 && height > 0) {
           area = width * height;
           return area;
       } else {
           return -1;
       }
    }

    public static double area(double radius) {
        double area = 1;
        if(radius > 0) {
            area = Math.pow(radius, 2) * Math.PI;
            return area;
        } else {
            return -1;
        }
    }
}
