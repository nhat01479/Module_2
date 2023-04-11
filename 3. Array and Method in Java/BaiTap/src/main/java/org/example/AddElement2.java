package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement2 {
public static Scanner scanner = new Scanner(System.in);
/* Chèn nhưng không thay đổi độ dài của mảng, phần tử cuối bị đẩy ra khỏi mảng */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        System.out.print("Nhap so can chen vao: ");
        int num = scanner.nextInt();
        System.out.print("Nhap vi tri can chen vao: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= a.length) {
            System.out.println("Khong chen duoc");
        }
        for (int i = a.length - 1; i >= index; i--){
            a[i] = a[i-1];
        }
        a[index] = num;
        System.out.println(Arrays.toString(a));

    }
}
