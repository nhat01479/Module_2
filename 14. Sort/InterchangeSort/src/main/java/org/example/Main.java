package org.example;

import java.util.Arrays;
//Đổi chỗ trực tiếp
public class Main {
    public static void main(String[] args) {

        int[] list = {5, 7, 4, 3, 2, 9, 8, 6, 1};
        interchangeSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void interchangeSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}