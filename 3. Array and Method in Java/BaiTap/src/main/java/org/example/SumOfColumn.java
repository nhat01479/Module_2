package org.example;

import java.util.Scanner;

public class SumOfColumn {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] numbers = inputArray();
        MaxValueInTwoDimensionalArray.showArray(numbers);//show mảng, lấy từ class tìm max

        System.out.print("Nhap cot muon tinh tong: ");
        int column = scanner.nextInt();

        int sum = sumOfColumn(column, numbers);

        System.out.println("Tong cot " + column + " la: " + sum);
    }

    public static int sumOfColumn(int column, int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
    public static int[][] inputArray(){
        System.out.print("Nhap size mang: x = ");
        int x = scanner.nextInt();
        System.out.print("Nhap size mang: y = ");
        int y = scanner.nextInt();
        System.out.println("Nhap lieu cho mang");
        int[][] array = new int[x][y];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
