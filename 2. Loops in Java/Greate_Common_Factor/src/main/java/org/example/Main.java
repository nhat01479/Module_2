package org.example;

import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Nhap a: ");
    int a = scanner.nextInt();
    System.out.print("Nhap b: ");
    int b = scanner.nextInt();
    a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0 || b == 0) {
      System.out.printf("Khong co uoc chung");
    }
    else {
      while (a != b) {
        if (a > b) {
          a = a - b;
        } else {
          b = b - a;
        }
      }
      System.out.println("Uoc chung lon nhat: " + a);
    }
  }
}