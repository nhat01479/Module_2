package org.example;

import java.util.Scanner;

public class Array2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /*  Mảng 2 chiều */
    int[][] array = new int[2][3];

    //Nhập liệu cho mảng
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
//        System.out.printf("array[%d][%d] = ", i, j);
        System.out.print("array[" + i + "][" + j + "] ");
        array[i][j] = scanner.nextInt();
      }
    }

    //Hiển thị dữ liệu mảng
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(array[i][j]);
      }
    }

  }
}
