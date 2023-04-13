package org.example;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, -5, 10, 11, 13, 16, 120, -131, 157};
        System.out.println(Arrays.toString(numbers));
        /*
        for (int i = 0; i < numbers.length; i++) {
            int hundreds = numbers[i] / 100;
            int tens = numbers[i] / 10;
            int ones = numbers[i] % 10;
            if (hundreds > 0) {
                if (tens > 0) {
                    if (hundreds % 2 != 0 && tens % 2 != 0 && ones % 2 != 0)
                        System.out.println(numbers[i] + " ");
                } else if (ones % 2 != 0)
                    System.out.println(numbers[i] + " ");
            } else if (tens > 0) {
                if (tens % 2 != 0 && ones % 2 != 0)
                    System.out.println(numbers[i] + " ");
            } else if (ones % 2 != 0)
                System.out.println(numbers[i] + " ");
        }
         */
        /*
        for (int i = 0; i < numbers.length; i++) {
            int num = Math.abs(numbers[i]);
            boolean checkOdd = true;
            while (num > 0) {
                int digits = num % 10;
                if (digits % 2 == 0){
                    checkOdd = false;
                    break;
                }
                num /= 10;
            }
            if (checkOdd)
                System.out.print(numbers[i] + " ");
        }
        */
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean checkOdd = true;
            while (num != 0) {
                int digits = num % 10;
                if (digits % 2 == 0){
                    checkOdd = false;
                    break;
                }
                num /= 10;
            }
            if (checkOdd)
                System.out.print(numbers[i] + " ");
        }
    }
}