package resizeable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Shape[] shapes = new Shape[5];
    shapes[0] = new Circle(5, "RED", true);
    shapes[1] = new Rectangle(8, 5, "RED", true);
    shapes[2] = new Square(6, "BLACK", false);
    shapes[3] = new Rectangle(5, 5, "RED", false);
    shapes[4] = new Rectangle(7, 5, "Red", true);
    double percent = (int) (Math.random() * (100 - 1) + 1);

//    boolean checkActionMenu = true;
//    do {
//      System.out.println("Danh sách tác vụ");
//      System.out.println("1. Thêm hình");
//      System.out.println("2. Sửa kích thước hình");
//      System.out.println("3. Xóa hình tại vị trí index");
//      System.out.println("4. Sắp xếp hình theo diện tích");
//      System.out.println("5. Sắp xếp hình theo tên");
//      System.out.println("6. Sắp xếp hình theo theo màu");
//      System.out.println("7. Tính tổng diện tích các hình");
//      System.out.println("8. Tính tổng diện tích các hình theo màu và trạng thái tô màu");
//      System.out.println("9. Tìm hình theo màu và tráng thái tô màu");
//      System.out.println("0. Thoát");
//      int choice = scanner.nextInt();
//      switch (choice) {
//        case 1:
//          addNewShape(shapes,2);
//          break;
//        case 2:
//
//          break;
//        case 3:
//          exercisePrintRectangle();
//          break;
//      }
//      System.out.println("Do you want continue? Y/N");
//      scanner.nextLine();
//      String choiceContinue = scanner.nextLine();
//      switch (choiceContinue) {
//        case "Y":
//          checkActionMenu = true;
//          break;
//        case "N":
//          checkActionMenu = false;
//          break;
//      }
//    } while (checkActionMenu);

 System.out.println("Mang ban dau");
 showShapes(shapes);

 shapes = addNewShape(shapes, 1);
 System.out.println("Mang sau khi them");
 showShapes(shapes);


 shapes = deleteShape(0, shapes);

 System.out.println("Mang sau khi xoa");
 showShapes(shapes);

 System.out.println("Sap xep");
 sortByArea(shapes);

 System.out.println("Mang sau khi sap xep");
 showShapes(shapes);

 double total = getTotalArea(shapes);
 System.out.printf("Tong dien tich: %s\n", total);


 double total1 = getTotalArea(shapes, true, "RED");
 System.out.printf("Tong dien tich cac hinh co mau do va duoc to mau: %s\n", total1);

 System.out.println("Tim kiem theo mau va trang thai to mau");
 getShapeByColorAndIsFilled(shapes,"Red",true);


  }

  public static Shape[] addNewShape(Shape[] shapes, int num) {
    Shape[] newShapes = new Shape[shapes.length + 1];
    for (int i = 0; i < shapes.length; i++) {
      newShapes[i] = shapes[i];
    }
    switch (num) {
      case 1:
        newShapes[shapes.length] = new Circle(4);
        break;
      case 2:
        newShapes[shapes.length] = new Rectangle(10, 15);
        break;
      default:
        newShapes[shapes.length] = new Square(5);
    }
    return newShapes;
  }
  public static void reSize(Shape[] shapes){
    for (Shape shape: shapes){
      shape.resize(50);
    }
  }

  public static Shape[] deleteShape(int index, Shape[] shapes) {
    Shape[] newShapes = new Shape[shapes.length - 1];
    for (int i = 0, j = 0; i < shapes.length; i++) {
      if (i == index) {
        continue;
      }
      newShapes[j] = shapes[i];
      j++;
    }
    return newShapes;
  }

  public static void sortByArea(Shape[] shapes) {
    ComparatorArea comparator = new ComparatorArea();
    Arrays.sort(shapes, comparator);
  }

  public static void showShapes(Shape[] shapes) {
    for (Shape shape : shapes) {
      System.out.println(shape.toString());
    }
  }

  public static double getTotalArea(Shape[] shapes) {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.getArea();
    }
    return total;
  }

  public static double getTotalArea(Shape[] shapes, Boolean boo, String color) {
    double total = 0;
    for (Shape shape : shapes) {
      if (shape.isFilled() == boo && (shape.getColor()).toUpperCase().equals(color.toUpperCase()))
        total += shape.getArea();
    }
    return total;
  }

  public static void getShapeByColorAndIsFilled(Shape[] shapes, String color, boolean boo) {
    for (Shape shape : shapes) {
      if ((shape.getColor()).toUpperCase().equals(color.toUpperCase()) && shape.isFilled() == boo) {
        System.out.println(shape);
      }
    }
  }


}
