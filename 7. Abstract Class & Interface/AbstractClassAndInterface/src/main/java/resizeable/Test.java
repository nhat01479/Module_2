package resizeable;

public class Test {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(10);
    shapes[1] = new Rectangle(5,10);
    shapes[2] = new Square(20);
    double percent = (int)(Math.random()*(200 - 101) + 101);

    System.out.println("Truoc khi resize");
    for (Shape shape:shapes){
      System.out.println(shape.toString());
    }
    for (Shape shape:shapes){
      shape.resize(percent);
    }

    System.out.println();
    System.out.println("Sau khi resize");
    for (Shape shape:shapes){
      System.out.println(shape.toString());
    }
  }

}
