package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueInTwoDimensionalArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[][] numbers = {
//                {1, 5, 3},
//                {4, 6, 9},
//                {2, 8, 7}
//        };
        System.out.println("Nhap size ma tran ");
        int size_i = scanner.nextInt();
        int size_j = scanner.nextInt();

        int[][] numbers = inputTwoDimensionalArray(size_i,size_j);
        int min = findMinInTwoDimensionalArray(numbers);
        showArray(numbers);
        System.out.println("Min = " + min);



    }

    public static int findMinInTwoDimensionalArray(int[][] array) {
        int index_i = 0;
        int index_j = 0;
        int min = array[index_i][index_j];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    index_i = i;
                    index_j = j;
                }
            }
        }
        return min;
    }
    public static int[][] inputTwoDimensionalArray(int x, int y){
        int[][] array = new int[x][y];
        System.out.println("Nhap lieu cho ma tran");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
    public static void showArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
