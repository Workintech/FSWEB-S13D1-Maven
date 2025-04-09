package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking == true && clock > 20){
            isBarking = true;
        }
        else if(isBarking && clock < 8 && clock > 0){
            isBarking = true;
        }
        else{
            isBarking = false;
        }
        return isBarking;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if(firstAge >= 13 && firstAge <= 19){
            return true;
       }
       if(secondAge >= 13 && secondAge <= 19){
            return true;
       }
       if(thirdAge >= 13 && thirdAge <= 19){
            return true;
       }
       else {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            if(temp >= 35 && temp <= 45){
                return true;
            }
        }
        else if(!isSummer){
            if(temp >= 25 && temp <= 35){
                return true;
            }
        }
        return false;
    }

    public static double area(double width, double height) {
       if(width >= 0 && height >= 0){
           return width * height;
       }
       return -1;
    }

    public static double area(double radius) {
       if(radius >= 0){
           return radius*radius*Math.PI;
       }
       return -1;
    }
}
