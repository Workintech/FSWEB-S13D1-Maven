package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("shouldWakeUp Tests:");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("\nhasTeen Tests:");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("\nisCatPlaying Tests:");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("\narea Tests:");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        System.out.println(area(-1.0));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        boolean sonuc=false;

        if(isBarking==true && (clock>=20 && clock<=23 || clock>=0 && clock<8 )   )  sonuc=true;
       return sonuc;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
      boolean sonuc= false;
      if((firstAge<=19 && firstAge>=13)  || (secondAge<=19 && secondAge>=13) ||(thirdAge<=19 && thirdAge>=13)  ) sonuc=true;
          return sonuc;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean sonuc= false;
        if(!isSummer &&  temp<=35 && temp>=25) sonuc=true;
        if(isSummer &&  temp<=45 && temp>=25) sonuc=true;

        return sonuc;
    }

    public static double area(double width, double height) {
       double sonuc=0;
       sonuc=width*height;
       if(width<0 || height<0 ) sonuc=-1;
       return sonuc;
    }

    public static double area(double radius) {
        double sonuc = 0;
        if(radius<0)
           sonuc= -1;
       else  sonuc = radius * radius * Math.PI;

        
        return sonuc;


    }

}
