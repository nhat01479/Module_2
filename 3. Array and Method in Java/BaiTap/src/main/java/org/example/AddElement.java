package org.example;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(myList));

//        myList = addElement(7, myList);
//        System.out.println(Arrays.toString(myList));


        int value = 10;
        int indexofvalue = 9;

        if (indexofvalue < 0 || indexofvalue > myList.length - 1) {
            System.out.println("Khong them duoc");
        } else {
            myList = moveElementToIndex(indexofvalue, value, myList);
        }

        System.out.println(Arrays.toString(myList));
    }

    //Add element vào cuối mảng
    public static int[] addElement(int value, int[] numbers) {
        int[] newList = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newList[i] = numbers[i];
        }
        newList[newList.length - 1] = value;
        return newList;
    }
//Add element vào vị trí bất kỳ
    public static int[] moveElementToIndex(int index, int value, int[] numbers) {

        int[] newList = new int[numbers.length + 1];
        for (int i = 0; i < index; i++) {
            newList[i] = numbers[i];
        }
        newList[index] = value;

        for (int i = index; i < newList.length - 1; i++) {
            newList[i + 1] = numbers[i];
        }
        return newList;

    }
}
