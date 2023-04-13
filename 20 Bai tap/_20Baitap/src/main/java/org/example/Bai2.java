package org.example;

//Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố
public class Bai2 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 10, 11, 13, 15};
        for (int i = 0; i < numbers.length; i++) {
            boolean check = true;
            if (numbers[i] < 2)
                check = false;
            else {
                for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                    if (numbers[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check)
                System.out.println(numbers[i] + " tại vị trí thứ " + i);
        }
    }

}
