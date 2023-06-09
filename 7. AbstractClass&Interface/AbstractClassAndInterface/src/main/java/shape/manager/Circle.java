package shape.manager;

public class Circle extends Shape implements Resizeable {

  private double radius = 1.0;

  @Override
  public void resize(double percent) {
    this.radius = this.radius * (1 + percent / 100);
  }

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }


  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  @Override
  public String toString() {
    return String.format("A Circle with                     radius = %.2f, S = %.2f, P = %.2f", getRadius(), getArea(),
        getPerimeter()) + super.toString();
  }
}
