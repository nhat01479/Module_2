package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        System.out.println("Nhap so tien ban dau");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang can gui");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 1; i <= month; i++){
            totalInterest += money * (interestRate/100)/12;
        }
        System.out.printf("So tien sau %d thang gui voi lai suat %.1f la %.3f", month, interestRate, totalInterest);
    }
}