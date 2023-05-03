package org.example;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
  /**/      System.out.print("Nhập x ");
        int x = sc.nextInt();
        System.out.print("Nhập y ");
        int y = sc.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

        String s = "abc";
        CalculationExample.convert(s);
    }

    public static void convert(String str) {
        try {
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }

    public void calculate(int x, int y) {
        try {
            int add = x + y;
            int sub = x - y;
            int mul = x * y;
            int div = x / y;
            System.out.println("Tổng: " + add);
            System.out.println("Hiệu: " + sub);
            System.out.println("Tích: " + mul);
            System.out.println("Thương: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }
}