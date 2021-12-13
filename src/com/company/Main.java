package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean quit =true;
        Scanner sc = new Scanner(System.in);
        Scanner quitinput= new Scanner(System.in);
        int from;
        int to;
        double convert;
        while (quit){

            System.out.println("Enter A number for what you would like to convert from : ");
            System.out.println(" 1. Celsius \n 2. Fahrenheit \n 3. Kelvin ");
            try{
                from= sc.nextInt();
                if (from>3 || from<1){
                    throw new Exception("Choice outside of Bounds");
                }
            } catch (Exception e){
                System.out.println("Please enter a number between 1 and 3");
                continue;
            }
            System.out.println("Enter A number for what you would like to convert to: ");
            System.out.println(" 1. Celsius \n 2. Fahrenheit \n 3. Kelvin ");
            try{
                to=sc.nextInt();
                if (to>3 || to<1){
                    throw new Exception("Choice outside of Bounds");
                }
            } catch (Exception e){
                System.out.println("Please enter a number between 1 and 3");
                continue;
            }
            System.out.println("Enter Temperature");
            convert=sc.nextDouble();

            switch (from) {
                case 1 -> {
                    System.out.println(convertCelsius(to, convert));

                }
                case 2 -> {
                    System.out.println(convertFahrenheit(to, convert));

                }
                case 3 -> System.out.println(convertKelvin(to, convert));
            }
            System.out.println("Would you like to go again? \n Y=Yes, N=No");
            String again = quitinput.nextLine();
            again.toUpperCase();
            if(!again.toUpperCase().equals("Y")) {
                quit=false;
            }
        }
    }

     static double convertCelsius(int choice, double convert){
         return switch (choice) {
             case 2 -> convert * 1.8+ 35;
             case 3 -> convert + 273.15;
             default -> convert;
         };
     }

     static double convertFahrenheit(int choice, double convert){
         return switch (choice) {
             case 1 -> (convert- 32) / 1.8;
             case 3 -> (convert- 32) * 1.8 +273.15;
             default -> convert;
         };
     }

     static double convertKelvin(int choice, double convert){
         return switch (choice) {
             case 1 -> convert -273.15;
             case 2 -> (convert- 273.15) *1.8 +32;
             default -> convert;
         };
     }



}
