package org.example;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
/*  Sao chép mảng
        int[] a = {1,2,3,5,4};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
            System.out.printf("b[%d] - %d \n", i, b[i]);
        }
*/

        int[] a = {1, 2, 3, 5, 4};
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d] - %d \n", i, b[i]);
        }


        int[] c = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.printf("c[%d] - %d \n", i, c[i]);
        }
    }
}
