package org.example;

public class Triangle extends Shape{
    private double side1, side2, side3;

    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
            this.side3 = side3;
    }
//    public boolean checkTriangle(){
//        return  (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
//    }
    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }
    public double getArea(double x){
        return Math.sqrt(x/2*(x/2-getSide1())*(x/2-getSide2())*(x/2-getSide3()));
    }

    @Override
    public String toString() {
        return "[side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = " + getSide3() +"]\n" +
               "S = " + getArea(getPerimeter()) + " - P = " + getPerimeter() + "\n" + "Triangle is a " + super.toString();
    }


}
