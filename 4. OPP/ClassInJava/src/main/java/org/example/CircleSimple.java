package org.example;

//Test
public class CircleSimple {
    public static void main(String[] args) {
        CircleSimple circle1 = new CircleSimple();
        System.out.printf("Dien tich hinh tron voi ban kinh %s la %.3f \n", circle1.radius, circle1.getArea());

        CircleSimple circle2 = new CircleSimple(2);
        System.out.printf("Dien tich hinh tron voi ban kinh %s la %.3f \n", circle2.radius, circle2.getArea());


        CircleSimple circle3 = new CircleSimple(10);
        System.out.printf("Dien tich hinh tron voi ban kinh %s la %.3f \n", circle3.radius, circle3.getArea());
        circle3.setRadius(100);
        System.out.printf("Dien tich hinh tron voi ban kinh %s la %.3f \n", circle3.radius, circle3.getArea());

    }

    double radius;

    CircleSimple() {
        radius = 1;
    }

    CircleSimple(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

}

