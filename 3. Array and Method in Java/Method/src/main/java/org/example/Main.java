package org.example;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/*  Phương thức - Method
        -   Là 1 nhóm các câu lệnh thực hiện 1 nhiệm vụ nhất định;
        -   Còn gọi là function (hàm) hay procedure (thủ tục)
        -   System.out.println(), Math.pow(), Math.random() là các phương thức đã được định nghĩa sẵn
        -   Trong lớp main() có thể gọi trực tiếp đến hàm được định nghĩa là static;
        Cú pháp:
                static   kiểu_trả_về  tên_hàm(tham_số){
                    khối lệnh;
                    [return giá_trị;]
                }

         -  kiểu_trả_về: + void - nếu hàm không trả về dữ liệu;
                         + nếu hàm có trả về dữ liệu thì kiểu_trả_về là kiểu dữ liệu ứng với giá trị trả về;
                         + ví dụ: giá trị trả về là true/false thì kiểu_trả_về là boolean;
                                  giá trị trả về là số nguyên thì kiểu_trả_về là int hoặc long;
         -  tham_số: các tham số của hàm

         -  Chú ý:  KHÔNG ĐỊNH NGHĨA HÀM TRONG HÀM KHÁC

 */
        //Gọi hàm calSum()
        System.out.println("Tong 3 so la: ");
        System.out.println(calSum(1, 2, 3));

        //Gọi hàm printGrade()
        System.out.println("The grade is ");
        printGrade(90.5);
        System.out.println("The grade is ");
        printGrade(59.5);

    }

    //Định nghĩa hàm calSum() ở ngoài hàm main()
    static int calSum(int a, int b, int c) {
        int sum;
        sum = a + b + c;
        return sum;
    }
    //Định nghĩa hàm printGrade() không có kiểu dữ liệu trả về
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}