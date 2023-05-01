package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void  selectionSort(double[] array){
        for (int i = 0; i < array.length - 1; i++){
            double min = array[i];
            int minIndex = i;
           for (int j = i + 1; j < array.length; j++){
               if (array[j] < min) {
                   min = array[j];
                   minIndex = j;
               }
           }
           if (minIndex != i){
               array[minIndex] = array[i];
               array[i] = min;
           }
        }
    }

}