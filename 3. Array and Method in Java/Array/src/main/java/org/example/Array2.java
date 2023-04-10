package org.example;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*  Mảng 2 chiều

        int[][] array = new int[2][3];
        int[][] array = {{row values}, ..., {row values}}

        //Nhập liệu cho mảng

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
//        System.out.printf("array[%d][%d] = ", i, j);
        System.out.print("array[" + i + "][" + j + "] ");
        array[i][j] = scanner.nextInt();
      }
    }
        //Nhập các giá trị ngẫu nhiên

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        //Hiển thị dữ liệu mảng

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
*/

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //Tính tổng các phần tử trong mảng
//        int total = 0;
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++){
//                total += array[i][j];
//            }
//        }
//        System.out.printf("Tong cac phan tu trong mang la %d: ", total);
        //Tính tổng từng cột
        for (int j = 0; j < array[0].length; j++){
            int total = 0;
            for (int i = 0; i < array.length; i++){
                total += array[i][j];
            }
            System.out.println("Tong cot j = " + j + " la " + total );
        }
        //Tìm dòng có tổng lớn nhất
        int maxRow = 0;
        int index = 0;
        for (int j = 0; j < array[0].length; j++){
            maxRow += array[0][j];
        }
        for (int i = 1; i < array.length; i++){
            int totalThisRow = 0;
            for (int j = 0; j < array[i].length; j++){
                totalThisRow += array[i][j];
                if (totalThisRow > maxRow){
                    maxRow = totalThisRow;
                    index = i;
                }
            }
        }
        System.out.printf("Dong co tong lon nhat la %d voi tong = %d", index, maxRow);
        //Xáo trộn mảng
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                int i1 = (int)(Math.random()*array.length);
                int j1 = (int)(Math.random()*array[i].length);
                int temp = array[i][j];
                array[i][j] = array[i1][j1];
                array[i1][j1] = temp;
            }
        }

    }
}
