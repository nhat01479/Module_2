package org.example;
//[Bài tập] Access modifier

public class Circle {

  public static void main(String[] args) {
    Circle circle1 = new Circle();
    System.out.println(circle1.getRadius());
    System.out.println(circle1.getArea());
    System.out.println(circle1);
  }

  private double radius;
  private String color;

  public Circle() {
    this.radius = 1;
    this.color = "red";
  }

  public Circle(double radius) {
    this.radius = radius;
  }

   protected double getRadius() {
    return this.radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            ", color='" + color + '\'' +
            '}';
  }
}
