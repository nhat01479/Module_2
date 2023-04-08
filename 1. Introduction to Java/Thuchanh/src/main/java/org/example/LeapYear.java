package org.example;
import java.util.Scanner;

public class LeapYear {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("Nhập vào năm cần kiểm tra");
    int year = scanner.nextInt();
    if (year % 4 == 0) {
      if (year % 100 != 0) {
        System.out.println(year + " la nam nhuan");
      }
      else {
        if (year % 400 == 0) {
          System.out.println(year + " la nam nhuan");
        }
        else {
          System.out.println(year + " khong phai nam nhuan");
        }
      }
    }
    else {
      System.out.println(year + " khong phai nam nhuan");
    }
  }
}

