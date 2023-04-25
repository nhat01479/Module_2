package resizeable;

import java.util.Comparator;

public abstract class Shape implements Resizeable {
  private String color = "green";
  private boolean filled = true;

  @Override
  public void resize(double percent) {

  }

  public Shape() {
  }

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  public abstract double getArea();

  @Override
  public String toString() {
    return String.format(" - Color: %s, %s",getColor(),(isFilled() ? "filled" : "not filled"));
  }
}
