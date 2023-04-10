package org.example;

import java.util.Scanner;

public class FindMaxinArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*15);
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        int max = a[0];
        int index = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        System.out.printf("a[%d] = %d là max", index, max);
    }
}
