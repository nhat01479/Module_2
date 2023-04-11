package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        do {
            System.out.print("Nhap size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Khong hop le");
        } while (size > 30);


        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap diem cho hoc sinh " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("Danh sach diem: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print("Hoc sinh " + (j + 1) + ": " + array[j] + " diem\n");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("So hoc sinh vuot qua ky thi la: " + count);
    }
}