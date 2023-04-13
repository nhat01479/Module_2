package org.example;

//Bài 5: Kiểm tra mảng có giảm dần hay không
public class Bai5 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 4, 1};
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(checkDescendingArray(array));
        System.out.println(checkDescendingArray(arr));
    }

    public static boolean checkDescendingArray(int[] a) {
        boolean check = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                check = false;
                break;
            }
        }
        return check;
    }
}
