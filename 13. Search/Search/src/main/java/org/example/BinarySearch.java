package org.example;

import java.util.Scanner;

public class BinarySearch {

public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 8, 9, 11};
        System.out.print("Nhập value: ");
        int value = scanner.nextInt();
        int indexOfValue = binarySearch(array, value);
        if (indexOfValue == -1)
            System.out.printf("%d không nằm trong mảng", value);
        else
            System.out.printf("%d nằm ở vị trí số %d", value, indexOfValue);
    }

    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (value < array[mid])
                high = mid - 1;
            else if (value == array[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;

    }
    public static int binarySearch2(int[] array, int value){
        int left = 0;
        int right = array.length - 1;
        while (right >= left){
            int mid = (right + left)/2;
            if (value > array[mid])
                left = mid + 1;
            else if (value == array[mid])
                return mid;
            else
                right = mid - 1;
        }
        return -1;
    }

}
