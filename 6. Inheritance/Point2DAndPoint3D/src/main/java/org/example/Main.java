package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2d = new Point2D();
        point2d.setX(1);
        point2d.setY(2);
        System.out.println(Arrays.toString(point2d.getXY()));
        System.out.println(point2d);

        Point3D point3D = new Point3D();
        point3D.setXYZ(point2d.getX(), point2d.getY(), 3);
        System.out.println(point3D);
    }
}