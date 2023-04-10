package org.example;

import java.util.Scanner;

public class ConvertTemperature {
    public static double convertCtoF(double c){
        double f;
        f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double convertFtoC(double f){
        double c;
        c = (5.0 / 9) * (f - 32);
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nhiet do");
        double temp = scanner.nextDouble();
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Fahrenhait to Celcius");
            System.out.println("2. Celcius to Fahrenhait");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(temp + " do F = " + convertFtoC(temp) + " do C");
                    break;
                case 2:
                    System.out.println(temp + " do C = " + convertCtoF(temp) + " do F");
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
