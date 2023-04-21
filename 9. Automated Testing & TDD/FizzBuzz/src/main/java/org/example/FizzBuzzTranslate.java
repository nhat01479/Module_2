package org.example;

import java.text.NumberFormat;

public class FizzBuzzTranslate {
    public static void main(String[] args) {
        int x = -6;
        System.out.println(FizzBuzzTranslate.translateFizzBuzz(x));
    }
    public static String translateFizzBuzz(int number) {
        if (number > 0 && number < 100) {
            if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
            else if (number % 3 == 0 || checkNumber3(number)) return "Fizz";
            else if (number % 5 == 0 || checkNumber5(number)) return "Buzz";
            else return readNumber(number);
        } else return "Khong hop le";
    }

    public static boolean checkNumber3(int number) {
        boolean check = false;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3') {
                check = true;
                break;
            }
        }
        return check;
    }
    public static boolean checkNumber5(int number) {
        boolean check = false;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '5') {
                check = true;
                break;
            }
        }
        return check;
    }

    public static String readNumber(int number) {
        String[] nums = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        if (number < 100) {
            if (number < 10)
                return nums[number];
            else return nums[number / 10] + " " + nums[number % 10];
        } else return Integer.toString(number);
    }
}

