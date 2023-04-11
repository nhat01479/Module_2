package org.example;

import java.util.Scanner;

public class FindMin {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputArrayAndPrintMin();

    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return  min;
    }
    public static void inputArrayAndPrintMin(){
        int[] array = new int[10];
        System.out.println("Hiển thị mảng: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
            System.out.printf("array[%d] = %d \n", i, array[i]);
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: ");
        for  (int i = 0;i<array.length; i++){
            if (array[i] == findMin(array)){
                System.out.printf("array[%d] = %d\n",i, array[i]);
            }
        }
    }
}
