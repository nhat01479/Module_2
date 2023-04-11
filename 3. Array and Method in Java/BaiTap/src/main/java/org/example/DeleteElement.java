package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exerciseDeleteElementInArray();


    }


    public static int findIndexOfElementInArray(int num, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void deleteElement(int index, int[] array) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;


    }
    public static void  showArrayAfterDelete(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void exerciseDeleteElementInArray(){
        int[] array = {1, 2, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
        System.out.print("Nhập số cần xoá: ");
        int num = scanner.nextInt();

        int index = findIndexOfElementInArray(num, array);
        while (index != -1){
            deleteElement(index, array);
            index = findIndexOfElementInArray(num, array);
        }
        showArrayAfterDelete(array);
    }
}