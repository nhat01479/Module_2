package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Nhap so can xoa");
        int num = scanner.nextInt();

        int indexOfNum = findIndex(num, numbers);
        numbers = removeElement(indexOfNum,numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int findIndex(int num, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
            }
        }
        return index;
    }
    public static int[] removeElement(int index, int[] array){
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
//        for (int i = 0; i < index; i++) {
//            newArray[i] = array[i];
//        }
//        for (int i = index; i < array.length - 1; i++) {
//            newArray[i] = array[i+1];
//        }
    }
}
