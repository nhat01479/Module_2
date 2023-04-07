package org.example;
import java.util.Scanner;
public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("USD: ");
    double usd = scanner.nextDouble();
    final double rate = 23000;
    double vnd = usd * rate;
    System.out.printf(usd + " USD = " + vnd + " VND");
  }
}