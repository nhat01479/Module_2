package org.example;

import java.util.Scanner;

public class CountIndexOfChar {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "helloabcdefgh";
        char c = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }
        System.out.printf("Co %d ky tu %s trong chuoi %s", count, c, str);
    }
}
