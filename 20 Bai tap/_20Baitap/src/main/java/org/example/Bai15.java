package org.example;

import java.util.ArrayList;
import java.util.Arrays;

//Bài 15: Hãy tất cả các số 1 về đầu mảng
public class Bai15 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 2, 3, 1, 4, 5, 1};
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                int temp = numbers[i];
                for (int j = i; j > k; j--) {
                    numbers[j] = numbers[j - 1];
                }
                numbers[k] = temp;
                k++;
            }
        }

        System.out.println(Arrays.toString(numbers));


    }

    public void baitap() {
        int[] numbers = {2, 1, 2, 3, 1, 4, 5, 1};
        for (int i = 0; i < numbers.length - 1; ) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == 1) {
                    int temp = numbers[i];
                    numbers[i] = 1;
                    numbers[j] = temp;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void moveOneToTheLeft(int[] numbers) {
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                int temp = numbers[i];
                for (int j = i; j > k; j--) {
                    numbers[j] = numbers[j - 1];
                }
                numbers[k] = temp;
                k++;
            }
        }
    }
}
