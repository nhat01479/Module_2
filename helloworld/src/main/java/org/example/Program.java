package org.example;
import java.lang.*;

import java.io.IOException;
import java.util.Scanner;

public class Program {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
/*
    System.out.println("Helloooooooooooo");


    System.out.println("Nhập vào 1 chuỗi"); //Trước khi nhập chuỗi hoặc ký tự, trong lệnh bàn phím có chứa ký tự "enter" thì sẽ nhập cho chuỗi luôn ==> bộ đệm nhập;
    String b = scanner.nextLine();          //Trước khi nhập liệu chuỗi phải đảm bảo bộ đệm không chứa gì hết ==> dùng: scanner.nextLine(); trước khi nhập
    scanner.nextLine();
    System.out.println(b);


    System.out.println("Nhập vào 1 số");
    int a = scanner.nextInt();
    System.out.println(a);

    int a = 6;
    int b = a++ + ++a*2;
    System.out.println(a); //a = 8;
    System.out.println(b); //b = 22;

    int radius = 10;
    final  double PI = 3.14;
    double area = radius * radius * PI;
    System.out.println(area);

    int a = 130;
    float b = 0.0f;
    double c = 0.0;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);


    int a;
    do {
      System.out.println("Nhap vao mot so lon hon 0");
      a = scanner.nextInt();
    }
    while (a < 0);

     int a = 5;
    int b = 2;
    System.out.println(a / b); // Chia lấy nguyên: 2
    System.out.println((float) a / b);  //Ép kiểu chia lấy số thực: 2.5
    System.out.println(a % b); //1

    float c = 5;
    int d = 2;
    System.out.println(c / d); //2.5
*/
    System.out.println("Nhập vào 1 số");
    int a = scanner.nextInt();
//    int a = Integer.parseInt(scanner.nextInt()); //Xử lý khi bị trôi dùng cách này hoặc cách dưới
    System.out.println(a);

    System.out.println("Nhập vào 1 chuỗi"); //Trước khi nhập chuỗi hoặc ký tự, trong lệnh bàn phím có chứa ký tự "enter" thì sẽ nhập cho chuỗi luôn ==> bộ đệm nhập;
    scanner.nextLine();                     //Trước khi nhập liệu chuỗi phải đảm bảo bộ đệm không chứa gì hết ==> dùng: scanner.nextLine(); trước khi nhập
    String b = scanner.nextLine();
    System.out.println(b);

    //Cách thức nhập liệu cho biến kiểu char
    char ch;
    System.out.println("Nhập ký tự: ");
    ch = (char) System.in.read();  //IOException
    System.out.println("Ký tự: " + ch);

    //Hoặc
    System.out.println("Nhập vào 1 chuỗi");
    String str = scanner.next();
    System.out.println("Chuỗi: " + str);

    char charr = str.charAt(0);
    System.out.println("Ký tự: " + charr);




  }
}

