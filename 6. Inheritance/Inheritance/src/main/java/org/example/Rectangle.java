package org.example;
//Kế thừa lớp Geometric
public class Rectangle extends Geometric {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, String filled, double width, double height) {
        super(color, filled); //Gọi contructor của lớp cha
        // setColor(color);
        // setFilled(filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + " - width: " + width + " - height: " + height;//ghi đè phương thức toString của lớp Geometric
    }
}
