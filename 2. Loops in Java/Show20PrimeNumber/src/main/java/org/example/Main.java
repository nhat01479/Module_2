package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap so luong SNT can in ra");
    int num = scanner.nextInt();
    int n = 2;
    int countSNT = 0;
    boolean check;

    while (countSNT < num) {
      check = true;
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          check = false;
          break;
        }
      }
      if (check) {
        countSNT++;
        System.out.println(n);
      }
      n++;
    }
/*
    for (int i = 2; i < 1000; i++) {
      check = true;
      if (countSNT < num) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
          if (i % j == 0) {
            check = false;
          }
        }
        if (check) {
          System.out.println(i);
          countSNT++;
        }
      }
    }
*/
  }
}