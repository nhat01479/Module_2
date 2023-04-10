package org.example;

import java.util.Scanner;

public class MenuWithMethod {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
launcher();

    }
    public static void launcher(){
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    exercisePrintTriangle();
                    break;
                case 2:
                    exercisePrintSquare();
                    break;
                case 3:
                    exercisePrintRectangle();
                    break;
            }
            System.out.println("Do you want continue? Y/N");
            scanner.nextLine();
            String choiceContinue = scanner.nextLine();
            switch (choiceContinue) {
                case "Y":
                    checkActionMenu = true;
                    break;
                case "N":
                    checkActionMenu = false;
                    break;
            }
        } while (checkActionMenu);
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            String str = "";
            for (int j = 0; j < height; j++) {
                str += "* ";
            }
            System.out.println(str);
        }
    }

    public static void exercisePrintRectangle() {
        System.out.println("In hình chữ nhật");
        System.out.print("Nhập chiều dài: ");
        int w = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int h = scanner.nextInt();
        printRectangle(w, h);
    }

    public static void printTriangle(int width) {
        for (int i = 0; i < width; i++) {
            String str = "";
            for (int j = 0; j <= i; j++) {
                str += "* ";
            }
            System.out.println(str);
        }
    }

    public static void exercisePrintTriangle() {
        System.out.println("In hình tam giác");
        System.out.println("Nhập cạnh: ");
        int w = scanner.nextInt();
        printTriangle(w);
    }

    public static void printSquare(int width) {
        for (int i = 0; i < width; i++) {
            String str = "";
            for (int j = 0; j < width; j++) {
                str += "* ";
            }
            System.out.println(str);
        }
    }

    public static void exercisePrintSquare() {
        System.out.println("In hình vuông");
        System.out.print("Nhập cạnh: ");
        int w = scanner.nextInt();
        printSquare(w);
    }

}
