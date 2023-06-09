package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice = -1;
    while (choice != 4) {
      System.out.println("Menu");
      System.out.println("1. Print the rectangle");
      System.out.println("2. Print the square triangle");
      System.out.println("3. Print isosceles triangle");
      System.out.println("4. Exit");
      System.out.println("Enter your choice");
      choice = scanner.nextInt();
      String str = "";
      switch (choice) {
        case 1:
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
              str += "* ";
            }
            str += "\n";
          }
          System.out.println(str);
          break;
        case 2:
          int direction = -1;
          while (direction != 5) {
            System.out.println("Choose direction of triangle");
            System.out.println("1. Top-left");
            System.out.println("2. Top-right");
            System.out.println("3. Bottom-left");
            System.out.println("4. Bottom-right");
            System.out.println("5. Exit");
            direction = scanner.nextInt();
            str = "";
            switch (direction) {
              case 1:
                for (int i = 0; i < 5; i++) {
                  for (int j = 0; j <= 5 - 1 - i; j++) {
                    str += "* ";
                  }
                  str += "\n";
                }
                System.out.println(str);
                break;
              case 2:
                for (int i = 0; i < 5; i++) {
                  for (int j = 0; j < 5; j++) {
                    if (j >= i) {
                      str += "* ";
                    } else {
                      str += "  ";
                    }
                  }
                  str += "\n";
                }
                System.out.println(str);
                break;
              case 3:
                for (int i = 0; i < 5; i++) {
                  for (int j = 0; j < 5; j++) {
                    if (j <= i) {
                      str += "* ";
                    } else {
                      str += "  ";
                    }
                  }
                  str += "\n";
                }
                System.out.println(str);
                break;
              case 4:
                for (int i = 0; i < 5; i++) {
                  for (int j = 0; j < 5; j++) {
                    if (j >= 5 - 1 - i) {
                      str += "* ";
                    } else {
                      str += "  ";
                    }
                  }
                  str += "\n";
                }
                System.out.println(str);
                break;
              case 0:
                System.out.println("Exit");
                break;
              default:
                System.out.println("No choice");
            }
          }
          break;
        case 3:
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
              if (j >= 10 - i && j <= 10 + i) {
                str += "*";
              } else {
                str += " ";
              }
            }
            str += "\n";
          }
          System.out.println(str);
          break;
        case 4:
          System.out.println("Exit");
          break;
        default:
          System.out.println("No choice");
      }
    }
  }
}
