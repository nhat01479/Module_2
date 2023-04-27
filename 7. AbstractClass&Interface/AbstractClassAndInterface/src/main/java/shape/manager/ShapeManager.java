package shape.manager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShapeManager {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5, "RED", true);
        shapes[1] = new Rectangle(8, 5, "RED", true);
        shapes[2] = new Square(6, "BLACK", false);
        shapes[3] = new Rectangle(5, 5, "Green", false);
        shapes[4] = new Rectangle(7, 5, "Red", true);
        double percent = (int) (Math.random() * (100 - 1) + 1);


//        boolean checkActionMenu = true;
        int choose = -1;
        do {
            System.out.println("Danh sách tác vụ");
            System.out.println("1. Thêm hình");
            System.out.println("2. Sửa hình");
            System.out.println("3. Xóa hình tại vị trí index");
            System.out.println("4. Sắp xếp hình theo diện tích");
            System.out.println("5. Xem danh sách hình");
            System.out.println("6. Tính diện tích");
            System.out.println("7. Tìm hình theo màu và trạng thái tô màu");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    shapes = addNewShape(shapes, menuAddNewShape());
                    break;
                case 2:
                    menuEditShape(shapes);
                    break;
                case 3:
                    shapes = deleteShape(menuDeleteShape(shapes), shapes);
                    break;
                case 4:
                    menuSort(shapes);
                    break;
                case 5:
                    showShapes(shapes);
                    break;
                case 6:
                    menuGetArea(shapes);
                    break;
                case 7:
                    menuFindShape(shapes);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (choose != 0);
//            System.out.println("Do you want continue? Y/N");
//            scanner.nextLine();
//            String choiceContinue = scanner.nextLine();
//            switch (choiceContinue) {
//                case "Y":
//                    checkActionMenu = true;
//                    break;
//                case "N":
//                    checkActionMenu = false;
//                    break;
//            }
//        } while (checkActionMenu);
//        showShapes(shapes);

    }

    //Menu add new shape
    public static Shape[] addNewShape(Shape[] shapes, int num) {
        Shape[] newShapes = new Shape[shapes.length + 1];
        for (int i = 0; i < shapes.length; i++) {
            newShapes[i] = shapes[i];
        }
        switch (num) {
            case 1:
                newShapes[shapes.length] = inputCircle();
                break;
            case 2:
                newShapes[shapes.length] = inputRectangle();
                break;
            default:
                newShapes[shapes.length] = inputSquare();
        }
        return newShapes;
    }

    public static int menuAddNewShape() {

        int choice = -1;
        do {
            System.out.println("Nhập hình muốn thêm");
            System.out.println("1. Hình tròn");
            System.out.println("2. Hình chữ nhật");
            System.out.println("3. Hình vuông");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 1 && choice > 3);
        return choice;
    }

    public static Circle inputCircle() {
        System.out.println("Nhập bán kính");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập color");
        String color = scanner.nextLine();
        int choice = -1;
        boolean isFilled = true;
        do {
            System.out.println("isFilled");
            System.out.println("1. true");
            System.out.println("2. false");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    isFilled = true;
                    break;
                case 2:
                    isFilled = false;
                    break;
            }
        } while (choice != 1 && choice != 2);
        Circle circle = new Circle(radius, color, isFilled);
        return circle;
    }

    public static Rectangle inputRectangle() {
        System.out.println("Nhập width");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập length");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập color");
        String color = scanner.nextLine();
        int choice = -1;
        boolean isFilled = true;
        do {
            System.out.println("isFilled");
            System.out.println("1. true");
            System.out.println("2. false");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    isFilled = true;
                    break;
                case 2:
                    isFilled = false;
                    break;
            }
        } while (choice != 1 && choice != 2);
        Rectangle rectangle = new Rectangle(width, length, color, isFilled);
        return rectangle;
    }

    public static Square inputSquare() {
        System.out.println("Nhập size");
        double size = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập color");
        String color = scanner.nextLine();
        int choice = -1;
        boolean isFilled = true;
        do {
            System.out.println("isFilled");
            System.out.println("1. true");
            System.out.println("2. false");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    isFilled = true;
                    break;
                case 2:
                    isFilled = false;
                    break;
            }
        } while (choice != 1 && choice != 2);
        Square square = new Square(size, color, isFilled);
        return square;
    }

    //Menu edit shape
    public static void menuEditShape(Shape[] shapes) {
        int index = -1;
        do {
            System.out.println("Chọn vị trí hình muốn sửa");
            index = Integer.parseInt(scanner.nextLine());
        } while (index < 0 && index >= shapes.length - 1);
        System.out.printf("Hình bạn muốn sửa là %s tại vị trí %s\n", shapes[index].getClass().getSimpleName(), index);
        if (shapes[index] instanceof Circle) {
            System.out.println("1: Cập nhật hình tròn\n2: Thay hình tròn bằng hình khác");
            int actionMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (actionMenuEdit) {
                case 1:
                    Circle circle = inputCircle();
                    Circle circlePresent = (Circle) shapes[index];
                    circlePresent.setFilled(circle.isFilled());
                    circlePresent.setRadius(circle.getRadius());
                    circlePresent.setColor(circle.getColor());
                    break;
                case 2:
                    System.out.println("Bạn muốn sửa thành hình nào");
                    changeDifferenceType(shapes, index);
                    break;
            }
        }
        else if (shapes[index] instanceof Rectangle) {
            System.out.println("1: Cập nhật chữ nhật\n2: Thay hình chữ nhật bằng hình khác");
            int actionMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (actionMenuEdit) {
                case 1:
                    Rectangle rectangle = inputRectangle();
                    Rectangle rectanglePresent = (Rectangle) shapes[index];
                    rectanglePresent.setColor(rectangle.getColor());
                    rectanglePresent.setFilled(rectangle.isFilled());
                    rectanglePresent.setLength(rectangle.getLength());
                    rectanglePresent.setWidth(rectangle.getLength());
                    break;
                case 2:
                    System.out.println("Bạn muốn sửa thành hình nào\nNhập tên hình để xác nhận");
                    changeDifferenceType(shapes, index);
                    break;
            }
        }
        else if (shapes[index] instanceof Square) {
            System.out.println("1: Cập nhật hình vuông\n2: Thay hình vuông bằng hình khác");
            int actionMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (actionMenuEdit) {
                case 1:
                    Square square = inputSquare();
                    Square squarePresent = (Square) shapes[index];
                    squarePresent.setColor(square.getColor());
                    squarePresent.setFilled(square.isFilled());
                    squarePresent.setSide(square.getSide());
                    break;
                case 2:
                    System.out.println("Bạn muốn sửa thành hình nào");
                    changeDifferenceType(shapes, index);
                    break;
            }
        }
    }

    public static void chooseTypeShapeToEdit(Shape[] shapes, int index) {
        Set<String> shapeTypes = new HashSet<>();
        for (int i = 0; i < shapes.length; i++) {
            shapeTypes.add(shapes[i].getClass().getSimpleName());
        }
        Set<String> shapeTypeChoosens = new HashSet<>();
        for (String item : shapeTypes) {
            if (!item.equalsIgnoreCase(shapes[index].getClass().getSimpleName())) {
                shapeTypeChoosens.add(item);
            }
        }
        int i = 1;
        for (String item : shapeTypeChoosens) {
            System.out.println(item);
        }
    }

    public static void changeDifferenceType(Shape[] shapes, int index){
        chooseTypeShapeToEdit(shapes,index);
        String action = scanner.nextLine();
        switch (action){
            case "Rectangle":
                shapes[index] = inputRectangle();
                break;
            case "Circle":
                shapes[index] = inputCircle();
                break;
            case "Square":
                shapes[index] = inputSquare();
                break;
        }
    }
    public static void reSize(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.resize(50);
        }
    }

    //Menu delete shape
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

    public static int menuDeleteShape(Shape[] shapes) {
        int index = -1;
        do {
            System.out.println("Nhập vị trí hình muốn xoá");
            index = Integer.parseInt(scanner.nextLine());
        } while (index < 0 && index >= shapes.length - 1);
        return index;
    }

    //Menu sort
    public static void menuSort(Shape[] shapes) {
        int choice = -1;
        do {
            System.out.println("Sắp xếp các hình");
            System.out.println("1. Theo diện tích");
            System.out.println("2. Theo tên");
            System.out.println("3. Theo màu sắc");
            System.out.println("4. Theo trạng thái tô màu");
            System.out.println("0. Trở lại");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sortByArea(shapes);
                    break;
//                case 2:
//                    break;
//                case 3:
//                case 4:
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (choice != 0);
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

    public static void menuGetArea(Shape[] shapes) {
        int choice = -1;
        do {
            System.out.println("Menu tính diện tích");
            System.out.println("1. Tổng diện tích các hình");
            System.out.println("2. Diện tích các hình theo màu và trạng thái tô màu");
            System.out.println("0. Trở lại");
            double total = 0;
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    total = getTotalArea(shapes);
                    System.out.println(total);
                    break;
                case 2:
                    System.out.println("Nhập color");
                    String color = scanner.nextLine();
                    boolean isFilled = chooseFilled();
                    total = getTotalArea(shapes, isFilled, color);
                    System.out.println(total);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhập lại");
            }
        } while (choice != 0);
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
            if (shape.isFilled() == boo && (shape.getColor()).equalsIgnoreCase(color))
                total += shape.getArea();
        }
        return total;
    }

    public static void menuFindShape(Shape[] shapes) {
        int choice = -1;
        do {
            System.out.println("Menu tìm hình");
            System.out.println("1. Theo màu");
            System.out.println("2. Theo trạng thái tô màu");
            System.out.println("3. Theo tên hình"); //chưa
            System.out.println("0. Trở lại");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập màu muốn tìm");
                    String color = scanner.nextLine();
                    getShapeByColorAndIsFilled(shapes, color);
                    break;
                case 2:
                    boolean isFilled = chooseFilled();
                    getShapeByColorAndIsFilled(shapes, isFilled);
//                case 3:
//                case 0:
//                    System.exit(0);
                default:
                    System.out.println("Nhập lại");
            }
        } while (choice != 0);
    }

    public static void getShapeByColorAndIsFilled(Shape[] shapes, String color, boolean boo) {
        for (Shape shape : shapes) {
            if (shape.getColor().equalsIgnoreCase(color) && shape.isFilled() == boo) {
                System.out.println(shape);
            }
        }
    }

    public static void getShapeByColorAndIsFilled(Shape[] shapes, String color) {
        for (Shape shape : shapes) {
            if (shape.getColor().equalsIgnoreCase(color)) {
                System.out.println(shape);
            }
        }
    }

    public static void getShapeByColorAndIsFilled(Shape[] shapes, boolean isFilled) {
        for (Shape shape : shapes) {
            if (shape.isFilled() == isFilled) {
                System.out.println(shape);
            }
        }
    }

    public static void getShapeByClass(Shape[] shapes) {
    }

    public static boolean chooseFilled() {
        int choice1 = -1;
        boolean isFilled = true;
        do {
            System.out.println("isFilled");
            System.out.println("1. true");
            System.out.println("2. false");
            choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    isFilled = true;
                    break;
                case 2:
                    isFilled = false;
                    break;
            }
        } while (choice1 != 1 && choice1 != 2);
        return isFilled;
    }
}
