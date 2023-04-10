package org.example;

public class PassByArray {
    //Phương thức sau đây hiển thị các phần tử trong một mảng int:
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //
    public static void test(int number, int[] numbers) {
        number = 1001; // Assign a new value to number
        numbers[0] = 5555; // Assign a new value to numbers[0]
    }

    public static void main(String[] args) {
        /*Gọi hàm printArray()*/
        int[] a = {1, 2, 3, 4, 5, 6};
        printArray(a);
        //printArray(new int[]{3, 1, 2, 6, 4, 2});


        /* Gọi hàm test() */
        int x = 1;              //tham trị
        int[] y = new int[5]; //tham chiếu
        test(x,y);
        System.out.println("\nx = " + x);
        System.out.println("y[0] = " + y[0]);
    }
}
