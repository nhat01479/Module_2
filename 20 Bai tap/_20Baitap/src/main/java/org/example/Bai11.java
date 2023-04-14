package org.example;

import java.util.Arrays;

//Bài 11: Thêm x vào trong mảng tăng nhưng vẫn giữ nguyên tính tăng của mảng
public class Bai11 {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 7, 9, 10, 15};
        int value = 7;
        int index = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= value && a[i + 1] >= value) {
                index = i + 1;
                break;
            }
        }
        a = Bai10.addElementToArray(a, value, index);
        System.out.println(Arrays.toString(a));
    }
}
