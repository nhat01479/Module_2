package org.example;

public class Cylinder extends Circle {
    public static void main(String[] args) {

    }
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
//        getRadius();
//        getColor();
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Có thể @Override hoặc không vì có sự tương đồng trong cách tính diện tích
    public double getArea() {
        return super.getArea()*2 + super.getPerimeter() * height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + "height = " + height + "]" + " with " + super.toString();
    }
}
