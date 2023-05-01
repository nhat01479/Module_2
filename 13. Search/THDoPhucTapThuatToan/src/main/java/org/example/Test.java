package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Natural refers to anything that is not made by humans, but instead occurs or exists in the world around us. This can include things like plants, animals, rocks, bodies of water, and even the weather.";
        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) str.charAt(i); /* Đặt ascii = dạng số của ký tự ở vị trí i */
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++){
            if (frequentChar[i] > max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
