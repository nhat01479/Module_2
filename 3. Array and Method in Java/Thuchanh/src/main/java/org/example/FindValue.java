package org.example;

import java.util.Scanner;

public class FindValue {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] colors = {"yellow", "red", "green", "white"};
        System.out.println("Nhập tên màu");
        String color = scanner.nextLine();
        boolean check = false;
        int index = -1;
        for (int i = 0; i < colors.length; i++){
            if (colors[i].equals(color)){
                check = true;
                index = i;
                break;
            }
        }
        if (check){
            System.out.printf("%s được tìm thấy ở vị trí số %d", color, index);
        }
        else System.out.println("Không tìm thấy");
    }
}
