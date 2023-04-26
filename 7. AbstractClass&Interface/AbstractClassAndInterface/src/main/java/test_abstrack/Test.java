package test_abstrack;
//Shape là abstract class
public class Test {
    public static void main(String[] args) {
        Coordinates coor1 = new Coordinates(1,1);
        Coordinates coor2 = new Coordinates(3,5);
        Coordinates coor3 = new Coordinates(6,10);
//        Shape shape = new Shape(speed1); ==> lỗi do Shape là class trừu tượng ==> nó không thể định nghĩa từ contructor của nó

        Shape point = new Point(coor1);
        System.out.println("Dien tich point: " +  point.getArea());

        Shape circle = new Circle(coor2, 5);
        System.out.println("Dien tich circle: " +  circle.getArea());

        Shape rectangle = new Rectangle(coor3, 4,6);
        System.out.println("Dien tich rectangle: " +  rectangle.getArea());

    }
}
