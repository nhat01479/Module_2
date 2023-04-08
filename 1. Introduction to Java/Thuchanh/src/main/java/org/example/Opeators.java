package org.example;

import java.util.Scanner;

public class Opeators {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
        float width;
        float height;
    System.out.println("Width: ");
    width = scanner.nextFloat();
    System.out.println("Height: ");
    height = scanner.nextFloat();
    float area = width * height;
    System.out.println("Area: " + area);

  }
}
