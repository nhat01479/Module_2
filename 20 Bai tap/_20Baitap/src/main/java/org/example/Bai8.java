package org.example;

import java.util.Arrays;

//Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
public class Bai8 {
    public static void main(String[] args) {
        int[] array = {9, 1, 7, 4, 8, 3, 6, 5};
        System.out.println("Trước khi sắp xếp: " + Arrays.toString(array));
        sortOddNumbersInAscending(array);
        System.out.println("Sau khi sắp xếp:   " + Arrays.toString(array));
    }
    public static void sortOddNumbersInAscending(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] % 2 != 0 && a[j] % 2 != 0){
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
