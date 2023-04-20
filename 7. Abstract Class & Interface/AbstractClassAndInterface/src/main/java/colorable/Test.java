package colorable;

public class Test {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(10);
    shapes[1] = new Rectangle(5,10);
    shapes[2] = new Square(20);
    for (Shape shape: shapes){
      System.out.println(shape.toString());
      if (shape instanceof Colorable){
        ((Colorable) shape).howToColor();
      }
    }
  }
}
