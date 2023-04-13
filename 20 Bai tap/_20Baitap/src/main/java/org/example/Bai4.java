package org.example;

//Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
public class Bai4 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 0, 10, 15, 25, 30};
        int check = -1;
        for (int num : numbers) {
            if (num == 0){
                check = 1;
                break;
            }
            else
                check = 0;;
        }
        System.out.println(check);
    }
}
