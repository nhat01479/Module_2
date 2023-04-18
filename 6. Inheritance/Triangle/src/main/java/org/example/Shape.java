package org.example;

public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor("blue");
        shape.setFilled(true);
        System.out.println(shape);
    }
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "blue";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape with " + "color = '" + color + '\'' +  ", " + (filled ? "filled" : "not fill" + '}');
    }
}
