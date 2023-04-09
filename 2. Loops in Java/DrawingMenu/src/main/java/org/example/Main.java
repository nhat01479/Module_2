package org.example;

import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int choice = -1;
    while (choice != 0) {
      System.out.println("Menu");
      System.out.println("1. Draw the triangle");
      System.out.println("2. Draw the square");
      System.out.println("3. Draw the rectangle");
      System.out.println("0. Exit");
      System.out.println("Enter your choice");
      choice = scanner.nextInt();
      String str = "";
      switch (choice) {
        case 1:
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
              str += "* ";
            }
            str += "\n";
          }
          System.out.println(str);
          break;
        case 2:
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              str += "* ";
            }
            str += "\n";
          }
          System.out.println(str);
          break;
        case 3:
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
              str += "* ";
            }
            str += "\n";
          }
          System.out.println(str);
          break;
        case 0:
          System.out.println("Exit");
//          System.exit(0);
          break;
        default:
          System.out.println("No choice");
      }
    }
  }
}

