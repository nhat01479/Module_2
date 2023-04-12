package org.example;

import java.lang.*;
import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
    /* Sử dụng

    System.out.printf();


Định dạng kiểu số nguyên (Integer):

    %d : sẽ in số nguyên như tham số đầu vào.
    %6d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm khoảng trắng ở bên trái.
    %-6d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm khoảng trắng ở bên phải.
    %06d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm ký tự số 0 ở bên trái.
    %.2d : in tối đa 2 chữ số của số nguyên.

Định dạng kiểu chuỗi (String):

    %s : sẽ in chuỗi tham số đầu vào.
    %15s : sẽ in chuỗi như tham số đầu vào. Nếu số chữ số nhỏ hơn 15, đầu ra sẽ được thêm khoảng trắng ở bên trái.
    %-6s : sẽ in chuỗi như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm khoảng trắng ở bên phải.
    %.8s : in tối đa tối chuỗi 8 ký tự.

Định dạng kiểu số thực (Float):

    %f : sẽ in số thực như tham số đầu vào.
    %15f : sẽ in số thực như tham số đầu vào. Nếu số chữ số nhỏ hơn 15, đầu ra sẽ được thêm khoảng trắng ở bên trái.
    %.8f : hiển thị tối đa 8 chữ số thập phân của số.
    %9.4f : hiển thị tối đa 4 chữ số thập phân của số. Đầu ra sẽ chiếm ít nhất 9 ký tự. Nếu số chữ số không đủ, nó sẽ được đệm khoảng trắng.

    %4$2s: %4$ đại diện cho đối số thứ 4
    %1$2s: %1$ đại diện cho đối số thứ 1
    %3$2s: %3$ đại diện cho đối số thứ 3
    %2$2s: %2$ đại diện cho đối số thứ 2
    2s: độ rộng 2 khoảng trắng
*/


        System.out.printf("Integer : %d\n", 15);
        System.out.printf("Floating point number with 3 decimal digits: %.3f \n", 1.21312939123); //1.213
        System.out.printf("Floating point number with 8 decimal digits: %.8f \n", 1.21312939123);
        System.out.printf("String: %s, integer: %5d, float: %6.3f \n", "Hello", 589, 9.231435);
        System.out.printf("Re-order output %4$2s %1$2s %3$2s %2$2s \n", "a", "b", "c", "d");

//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhập tên: ");
//        String name = input.nextLine();
//        System.out.print("Nhập tuổi: ");
////        int age = input.nextInt();                    // bị trôi lệnh tại đây
//        int age = Integer.parseInt(input.nextLine());   //Đã xử lý trôi lệnh
////        input.nextLine();
//        System.out.print("Nhập địa chỉ: ");
//        String address = input.nextLine();
//
//        System.out.println(name + " -- " + age + " -- " + address);
    }
}
