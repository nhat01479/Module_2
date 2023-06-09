package resizeable;

public class Rectangle extends Shape implements Resizeable{
  private double width = 1.0;
  private double length = 1.0;

  @Override
  public void resize(double percent) {
    this.width = this.width * (1 + percent / 100);
    this.length = this.length * (1 + percent / 100);
  }

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getArea() {
    return width * this.length;
  }

  public double getPerimeter() {
    return 2 * (width + this.length);
  }

  @Override
  public String toString() {
    return String.format("A Rectangle with length = %.2f and width = %.2f, S = %.2f, P = %.2f",getLength(),getWidth(),getArea(),getPerimeter()) + super.toString();
  }


}