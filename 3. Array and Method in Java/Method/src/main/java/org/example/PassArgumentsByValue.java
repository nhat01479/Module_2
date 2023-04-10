package org.example;

public class PassArgumentsByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Truoc khi goi ham swap, num1 = " + num1 + " va num2 = " + num2);

        // Gọi hàm swap()
        swap(num1, num2);

        System.out.println("Sau khi goi ham swap, num1 = " + num1 + " va num2 = " + num2);
    }



    // Định nghĩa hàm swap()
    public static void swap(int n1, int n2) {
        System.out.println("\tTrong swap() method");
        System.out.println("\t\tTruoc khi swap, n1 = " + n1 + " va n2 = " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tSau khi swap, n1 = " + n1  + " va n2 = " + n2);
    }
}
