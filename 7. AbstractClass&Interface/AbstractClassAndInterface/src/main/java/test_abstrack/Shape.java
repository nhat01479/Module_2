package test_abstrack;

public abstract class Shape {
    protected Coordinates coor;

    public Shape(Coordinates coor) {
        this.coor = coor;
    }

    public Coordinates getCoordinates() {
        return coor;
    }

    public void setSpeed(Coordinates coor) {
        this.coor = coor;
    }

    public abstract double getArea(); //abstract method
}
