package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bai16 {
    static int hourglassSum(List<List<Integer>> arr) {
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(0).size() - 2; j++) {
                int hr_sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                            + arr.get(i + 1).get(j + 1)
                            + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                max_val = Math.max(max_val, hr_sum);
            }
        }
        return max_val;
    }
    public static List<List<Integer>> readFromFile(){

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\Module_2\\20 Bai tap\\_20Baitap\\src\\main\\java\\org\\example\\16.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            ;
        }

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = new String[0];
            try {
                arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arr;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = readFromFile();
        int result = hourglassSum(arr);
        System.out.println("Max sum of hourglass: " + result);

    }
}
