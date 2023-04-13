package org.example;

//Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class Bai6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 5};
        int[] aa = {1, 2, 5, 4, 5, 2};
        int[] b = {1, 2, 3, 4, 5};
        checkA(a,b);//false
        checkA(aa,b);//true
    }
    public static void checkA(int[] a,int[] b){
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            check = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    check = true;
                    break;
                }

            }
            if (!check)
                break;
        }
        System.out.println(check);
    }
}
