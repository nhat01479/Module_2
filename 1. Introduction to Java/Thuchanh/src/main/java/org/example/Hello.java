package org.example;

import java.util.Scanner;

public class Hello {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Nhap ten");
    String name = scanner.nextLine();
    System.out.println("Hello: " + name);
  }
}
