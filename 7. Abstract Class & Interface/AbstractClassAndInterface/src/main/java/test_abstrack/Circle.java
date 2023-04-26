package test_abstrack;

public class Circle extends Shape {
    private double radius;

    public Circle(Coordinates coor, double radius) {
        super(coor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
