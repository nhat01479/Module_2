package org.example;

import java.util.Arrays;

//Bài 9: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi
public class Bai9 {
    public static void main(String[] args) {
        int[] array = {9, 7, -1, -4, 8, -3, 6, 5};
        System.out.println("Trước khi sắp xếp: " + Arrays.toString(array));
        sortPositiveAscendingNegativeDescending(array);
        System.out.println("Sau khi sắp xếp:   " + Arrays.toString(array));
    }
    public static void sortPositiveAscendingNegativeDescending(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > 0 && a[j] > 0){
                    if (a[i] > a[j]){
                        swap(a,i,j);
                    }
                }
                if (a[i] < 0 && a[j] < 0){
                    if (a[i] < a[j]){
                        swap(a,i,j);
                    }
                }
            }
        }
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
