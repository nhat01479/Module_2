package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1,"blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(10);
        System.out.println(cylinder);
        System.out.println("Dien tich hinh tru: " + cylinder.getArea());
        System.out.println("The tich hinh tru: " + cylinder.getVolume());
    }
}