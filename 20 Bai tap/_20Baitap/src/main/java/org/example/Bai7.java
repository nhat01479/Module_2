package org.example;

import java.util.Arrays;

//Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
public class Bai7 {
    public static void main(String[] args) {
        int[] array = {9, 1, -7, 4, -8, 3, 6, -5};
        System.out.println("Trước khi sắp xếp: " + Arrays.toString(array));
        sortPositiveNumbersInAscending(array);
        System.out.println("Sau khi sắp xếp: " + Arrays.toString(array));
    }
    public static void sortPositiveNumbersInAscending(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > 0 && a[j] > 0){
                    if (a[i] > a[j]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
    }
}
