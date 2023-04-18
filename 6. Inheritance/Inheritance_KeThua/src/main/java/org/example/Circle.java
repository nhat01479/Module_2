package org.example;
/* Lớp con - sub class - Circle
* Sử dụng từ khoá extends để thể hiện lớp Circle thừa kế và mở rộng từ lớp Geometric
* Nhờ thừa kế lớp Cirlce nhận được các phương thức getColor, setColor, getFilled, setFillé và toString
*
* */
public class Circle extends Geometric{
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle); //"Geometric [color='white', filled='null']"
        circle.printCircle();       //"The white circle is created with the radius is 10.0']"
    }
    /* Lớp Circle mở rộng trường dữ liệu so với lớp cha khi có thêm biến radius*/
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, String filled, double radius) {
        this.radius = radius;
        //color và filled ở class cha là private
        setColor(color);    //gọi phương thức setColor để cài đặt thuộc tính color
        setFilled(filled);  //gọi phương thức setFilled để cài đặt thuộc tính filled
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }

    @Override
    public String toString() {
        return super.toString() + " - radius is " + radius;  //ghi đè phương thức toString của lớp Geometric.
    }
}
