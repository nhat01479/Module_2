package org.example;

import java.util.Arrays;

//Bài 12: Xóa tất cả các số âm trong mảng
public class Bai12 {
    public static void main(String[] args) {
        int[] a = {1, -2, 3, -4, -5, 6, 7, 8, 9};
        int count = countNegativeNumber(a);
        a = sortNumber(a);
        int i = 0;
        while (i < count) {
            a = removeNegativeNumber(a);
            i++;
        }
        System.out.println(Arrays.toString(a));

    }
//Đếm số lượng số âm trong mảng
    public static int countNegativeNumber(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
            }
        }
        return count;
    }

// Remove số cuối cùng trong mảng
    public static int[] removeNegativeNumber(int[] a) {
        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            b[i] = a[i];
        }
        return b;
    }

// Đưa các số dương về đầu mảng, các số âm về cuối mảng
    public static int[] sortNumber(int[] a) {
        for (int i = 0, j = 0; i<a.length; i++) {
         if (a[i] > 0){
             int temp = a[j];
             a[j] = a[i];
             a[i] = temp;
             j++;
         }
        }
        return a;
    }

//Xoá các số âm và đưa các số dương về đầu mảng, còn thừa lại các số 0
//    public static int[] removeNegativeNumber(int[] a) {
//        int[] b = new int[a.length];
//        for (int i = 0, j = 0; i < a.length; i++) {
//            if (a[i] > 0) {
//                b[j] = a[i];
//                j++;
//            }
//        }
//        return b;
//    }
}
