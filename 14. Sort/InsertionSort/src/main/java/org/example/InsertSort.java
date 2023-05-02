package org.example;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] list = {2, 4, 5, 3, 1, 7, 6};
        insertSort(list);
        System.out.println(Arrays.toString(list));

    }
    public static void insertSort(int[] array){
        for (int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > key){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
    }
}