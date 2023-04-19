package circle2;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {

  public static void main(String[] args) {
    Circle[] circles = new Circle[3];
    circles[0] = new Circle(10, "green", true);
    circles[1] = new Circle(50, "blue", true);
    circles[2] = new Circle(25, "white", false);

    System.out.println("Truoc khi sap xep");
    for (Circle circle : circles) {
      System.out.println(circle.toString());
    }

    CircleComparator circleComparator = new CircleComparator();
    Arrays.sort(circles, circleComparator); // Hàm sort của lớp Comparator truyền vào mảng circles và đối tượng vừa tạo ở trên circleComparator

    System.out.println("Sau khi sap xep");
    for (Circle circle : circles) {
      System.out.println(circle.toString());
    }
  }
}


