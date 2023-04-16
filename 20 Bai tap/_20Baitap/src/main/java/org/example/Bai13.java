package org.example;

import java.util.Arrays;

//Bài 13: Xóa tất cả các số chẵn trong mảng
public class Bai13 {
    public static void main(String[] args) {
        int[] a = {1, -2, 3, -4, -5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(a));

        int count = countEvenNumber(a);
        sortNumber(a);
        int k = 0;
        while (k < count){
            a = removeEvenNumber(a, count);
            k++;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void sortNumber(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
    }

    public static int[] removeEvenNumber(int[] a, int count) {
        int[] b;
        b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static int countEvenNumber(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
