package org.example;

import java.util.Arrays;

//Sắp xếp nổi bọt là một giải thuật sắp xếp đơn giản.
// Giải thuật sắp xếp này được tiến hành dựa trên việc so sánh cặp phần tử liền kề nhau và tráo đổi thứ tự nếu chúng không theo thứ tự.
public class BubbleSort {
    public static void main(String[] args) {
         int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
         bubbleSort(list);
         System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] list){
        boolean check = true; // Nếu danh sách đã được sắp xếp thì sẽ không cần phải chạy lại vòng lặp
        for (int j = 1; j < list.length && check; j++){
            check = false;
            for (int i = 0; i < list.length - j; i++){
                if (list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    check = true;
                }
            }
        }
    }
}