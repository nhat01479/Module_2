package org.example;

public class SumOfDiagonalLine {
    public static void main(String[] args) {
        int[][] numbers = SumOfColumn.inputArray();
        MaxValueInTwoDimensionalArray.showArray(numbers);
        int sumOfDiagonalLine = sumOfDiagonalLine(numbers);
        System.out.println("Tong cac so o duong cheo cua ma tran vuong la: " + sumOfDiagonalLine);
    }
    public static int sumOfDiagonalLine(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    sum += array[i][j];
            }
        }
        return  sum;
    }
}
