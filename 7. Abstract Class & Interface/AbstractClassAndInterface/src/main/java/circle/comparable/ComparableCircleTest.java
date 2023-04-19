package circle.comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle(15, "white",false);
        circles[2] = new ComparableCircle(9,"green",true);

        System.out.println("Trước khi sắp xếp");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("Sau khi sort");
        for (ComparableCircle circle: circles){
            System.out.println(circle.toString());
        }
    }
}
