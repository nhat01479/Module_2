package org.example;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so can check");
        int num = scanner.nextInt();
        boolean check = true;
        if (num < 2)
            check = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num + " la so nguyen to");
            } else {
                System.out.println(num + " khong phai so nguyen to");
            }
        }
    }
}