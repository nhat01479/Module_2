package org.example;

import java.util.Arrays;

public class BinarySearchByRecursive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 7, 8, 9, 4, 5, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
        int index = binarySearch(array, 0, array.length - 1, 3);
        System.out.println(index);

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left < right){
            int mid = (left + right) / 2;
            if (array[mid] == value) return mid;
            else if (value > array[mid])
                return binarySearch(array, mid + 1,right, value);
            else
                return binarySearch(array, left, mid - 1, value);
        }
        return  -1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}