package org.example;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] numbers_1 = {1, 2, 3, 4, 5};
        int[] numbers_2 = {6, 7, 8, 9, 10};
        int[] numbers = MergeArray(numbers_1, numbers_2);

        System.out.println(Arrays.toString(numbers));
    }
    public static int[] MergeArray(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = a.length, k = 0; j < c.length; j++, k++) {
            c[j] = b[k];
        }
        return c;
    }
}
