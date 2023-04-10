package org.example;

import java.util.Scanner;

public class ReverseArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap do dai cua mang size: ");
        int size = scanner.nextInt();
        int[] array;
        array = new int[size];
        //Nhap lieu cho mang
        System.out.println("Mảng ban đầu");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
        //Đảo mảng
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Mảng sau khi đảo");
        for (int i = 0; i < array.length; i++){
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }

    }
}
