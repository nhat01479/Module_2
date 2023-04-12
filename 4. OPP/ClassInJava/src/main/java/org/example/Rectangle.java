package org.example;

import java.util.Scanner;

public class Rectangle {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();

        Rectangle rect1 = new Rectangle(width,height);

        System.out.println("Your rectangle \n" + rect1.display());
        System.out.println("Area of the rectangle \n" + rect1.getArea());
        System.out.println("Perimeter of the rectangle \n" + rect1.getPerimeter());
    }
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
