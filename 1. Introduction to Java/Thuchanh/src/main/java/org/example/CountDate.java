package org.example;

import java.util.Scanner;

public class CountDate {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Nhập vào tháng cần kiểm tra");
    int month = scanner.nextInt();
//    switch (month) {
//      case 1:
//      case 3:
//      case 5:
//      case 7:
//      case 8:
//      case 10:
//      case 12:
//        System.out.println("Tháng " + month + " có 31 ngày");
//        break;
//      case 2:
//        System.out.printf("Tháng " + month + " có 28 hoặc 29 ngày");
//        break;
//      case 4:
//      case 6:
//      case 9:
//      case 11:
//        System.out.printf("Tháng " + month + " có 30 ngày");
//        break;
//      default:
//        System.out.println("Nhập sai");
//    }
    String daysInMonth;
    switch (month) {
      case 2:
        daysInMonth = "28 or 29";
        break;
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        daysInMonth = "31";
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        daysInMonth = "30";
        break;
      default:
        daysInMonth = "";
    }

    if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
    else System.out.print("Invalid input!");
  }
}
