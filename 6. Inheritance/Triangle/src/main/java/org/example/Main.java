package org.example;

import java.util.Scanner;

//[**Bài tập] Thiết kế và triển khai lớp Triangle
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap side1");
        double side1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap side2");
        double side2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap side3");
        double side3 = scanner.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("Canh khong hop le");
        }else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 < side1){
            System.out.println("Canh khong hop le");
        } else {
            System.out.println("Day la 3 canh cua 1 tam giac");
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.getPerimeter();
            triangle.getArea(triangle.getPerimeter());
            System.out.println(triangle);
        }
    }
}