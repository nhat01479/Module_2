package org.example;
//Bài 3: Đếm số lượng giá trị tận cùng bằng 5 trong mảng
public class Bai3 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 10, 15, 25, 30};
        int count = 0;
        for (int i = 0; i<numbers.length; i++){
            int num = numbers[i];
            num %= 10;
            if (num == 5) count++;
        }
        System.out.println("Số lượng giá trị tận cùng bằng 5 trong mảng: " + count);
    }
}
