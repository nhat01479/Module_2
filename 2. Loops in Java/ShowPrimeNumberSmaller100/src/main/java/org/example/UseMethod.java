package org.example;

import java.util.Scanner;

public class UseMethod {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercisePrintPrimeNumberLessThanNumber();
        enterNumberAndCheckNumberPrime();
    }

    //function nhập vào 1 số và in kết quả nếu đó là SNT, hàm này sẽ gọi hàm isPrimeNumber
    public static void enterNumberAndCheckNumberPrime() {
        System.out.print("Nhập vào 1 số: ");
        int num = scanner.nextInt();
        boolean check = isPrimeNumber(num);
        if (check) System.out.println(num + " là số nguyên tố");
        else System.out.println(num + " không phải là số nguyên tố");
    }

    //function check SNT
    public static boolean isPrimeNumber(int num) {
        boolean check = true;
        if (num < 2) check = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
    //function in ra các SNT nhỏ hơn num
    public static void printPrimeNumberLessThanNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    //Hàm này gọi hàm printPrimeNumberLessThanNumber(int num) ở phía trên
    public static void exercisePrintPrimeNumberLessThanNumber() {
        System.out.print("Hiển thị các số nguyên tố nhỏ hơn: ");
        int num = scanner.nextInt();
        printPrimeNumberLessThanNumber(num);
    }
}
