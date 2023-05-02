package org.example;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int[] list = {2, 4, 5, 3, 1, 5, 6};
        InsertionSortByStep ob = new InsertionSortByStep();
        ob.insertionSortByStep(list);
        System.out.println(Arrays.toString(list));

    }
    public  void insertionSortByStep(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("i = " + i);
            System.out.println("Gán temp = array[" + i + "] = " + array[i] + " và j = i = " + i);
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp){
                System.out.println("Nếu j = " + j +" > 0 và array[j - 1] = " + array[j - 1] + " > " + temp);
                System.out.println("Thay thế array[j] = array[j - 1]");
                array[j] = array[j - 1];
                System.out.print("Giảm j 1 đơn vị: j = ");
                j--;
                System.out.println(j);
            }
            System.out.println("Nếu j <= 0 || array[j - 1] <= " + temp);
            System.out.println("gán array[j] = temp = " + temp );
            array[j] = temp;
            System.out.print("List after the  " + (i + 1) + "' sort: ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + "\t");
            }
            System.out.println("\n--------------------------");
        }

    }

}
