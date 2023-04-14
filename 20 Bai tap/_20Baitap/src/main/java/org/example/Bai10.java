package org.example;

import java.util.Arrays;

//Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k
public class Bai10 {
    public static void main(String[] args) {
        int x = 7;
        int indexOfX = 3;

        int[] a = {1, 2, 3, 4, 5, 6,};
        System.out.println(Arrays.toString(a));
        a = addElementToArray(a, x, indexOfX);
        System.out.println(Arrays.toString(a));

    }
    public static int[] addElementToArray(int[] a, int value, int indexOfValue ){
        int[] b = new int[a.length + 1];
        for (int i = 0, j = 0; i <= a.length; i++) {
            if (i == indexOfValue)
                continue;
            b[i] = a[j];
            j++;
        }
        b[indexOfValue] = value;
        return b;
    }
}
