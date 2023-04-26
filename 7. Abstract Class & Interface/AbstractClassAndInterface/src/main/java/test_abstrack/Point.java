package test_abstrack;

public class Point extends Shape{
    public Point(Coordinates coor) {
        super(coor);
    }

    @Override
    public double getArea() {
        return 1;
    }

}
