package colorable;

public class Square extends Shape implements Colorable{
  private double side;

  @Override
  public void howToColor() {
    System.out.println("Color all four side");
  }

  public Square() {
  }

  public Square(double side) {
    this.side = side;
  }

  public Square(String color, boolean filled, double side) {
    super(color, filled);
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }
  public double getArea(){
    return side * side;
  }
  public double getPerimeter(){
    return side * 4;
  }

  @Override
  public String toString() {
    return String.format("A Square with side = %.2f, S = %.2f, P = %.2f is",getSide(),getArea(),getPerimeter()) + super.toString();
  }
}
