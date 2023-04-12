package org.example;

import java.util.Scanner;

public class QuadraticEquation {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Phuong trinh: " + a + "x2 + " + b + "x +" + c + " = 0");

        double delta = equation.getDiscriminant();

        if (a != 0) {
            if (delta > 0)
                System.out.printf("Nghiem la %.3f va %.1f", equation.getRoot1(delta), equation.getRoot2(delta));
            else if (delta == 0)
                System.out.printf("Nghiem la %.1f, ", equation.getRoot1(delta));
            else System.out.println("Vo nghiem");
        }
        else if (b != 0)
            System.out.println("Nghiem la " + -c/b);
        else if (c != 0)
            System.out.println("Vo nghiem");
        else System.out.println("Vo so nghiem");
    }

    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getParameter(double parameter) {
        return parameter;
    }

    //Tinh delta
    public double getDiscriminant() {
        double delta;
        delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1(double delta) {
        return (-b + Math.sqrt(delta)) / 2 * a;
    }

    public double getRoot2(double delta) {
        return (-b - Math.sqrt(delta)) / 2 * a;
    }

}