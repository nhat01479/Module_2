package org.example;


import java.util.Scanner;

public class FirstDegreeEquation {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Phương trình bậc nhất");
    System.out.println("a * x + b = 0");
    System.out.printf("a: ");
    double a = scanner.nextDouble();
    System.out.printf("b: ");
    double b = scanner.nextDouble();
    if (a != 0) {
      double answer = -b / a;
      System.out.println("Nghiệm là x = " + answer);
    }
    else {
        if (b == 0) {
          System.out.println("Phương trình vô số nghiệm");
        }
        else {
          System.out.println("Phương trình vô nghiệm");
        }
    }
  }
}
