package resizeable;

public class Square extends Shape implements Resizeable{
  private double side;

  @Override
  public void resize(double percent) {
    this.side *= (percent/100);
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
    return String.format("A Square with side = %.2f, S = %.2f, P = %.2f",getSide(),getArea(),getPerimeter());
  }
}