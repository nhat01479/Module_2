package org.example;

import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Nhap so can check");
    int num = scanner.nextInt();
    int count = 0;
    if (num < 2)
      System.out.println(num + " khong phai so nguyen to");
    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 0) {
      System.out.println(num + " la so nguyen to");
    } else {
      System.out.println(num + " khong phai so nguyen to");
    }
  }
}