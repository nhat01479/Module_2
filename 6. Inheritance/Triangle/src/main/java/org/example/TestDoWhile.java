package org.example;

import java.util.Scanner;

public class TestDoWhile {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double side1, side2, side3;
        do{
            System.out.println("Nhap side1");
            side1 = scanner.nextDouble();
        }while (side1 <= 0);
        do{
            System.out.println("Nhap side2");
            side2 = scanner.nextDouble();
        }while (side1 <= 0);

        do {
            System.out.println("Nhap side3");
            side3 = scanner.nextDouble();
            scanner.nextLine();
        } while (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1);
        System.out.println("Day la 3 canh cua 1 tam giac");
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.getPerimeter();
        triangle.getArea(triangle.getPerimeter());
        System.out.println(triangle);
    }
}
