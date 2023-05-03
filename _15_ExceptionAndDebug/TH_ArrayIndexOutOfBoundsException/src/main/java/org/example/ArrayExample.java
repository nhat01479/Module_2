package org.example;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập chỉ số bất kỳ");
        int index = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt giới hạn của mảng");
        }
    }
    public Integer[] createRandom(){
        Random random = new Random();
        System.out.println("Danh sách phần tử mảng");
        Integer[] array = new Integer[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}