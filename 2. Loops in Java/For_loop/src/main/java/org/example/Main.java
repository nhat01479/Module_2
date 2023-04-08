package org.example;

import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
/*  For loop

    for (int i=1; i <= 10; i++){
      int num = 5;
      System.out.println(num + "*" + i + "=" + num*i);
    }


    for (int i = 0; i < 5; i++) {
      String str = "";
      for (int j = 0; j <= i; j++) {
        str += "* ";
      }
      System.out.println(str);
    }
*/

/* For-each

Được sử dụng để duyệt qua các phần tử của 1 collection như: ArrayList, LinkedList, HashSet, ...

 Syntax:
      for (type var:collection) {

      }

      type: kiểu dữ liệu của các đối tượng của collection;
      var: biến đại diện lần lượt của các phần tử của collection trong mỗi lần lặp;
      collection: đối tượng cần lặp;

    int[] array = {1,2,3,4,5};
    for (int num: array){
      System.out.println(num);
    }
*/

/* While - loop

  while (condition) {
        statements;
  }

    System.out.println("Nhap so a");
    int a = scanner.nextInt();
    System.out.println("Nhap so b");
    int b = scanner.nextInt();
    System.out.println("Nhap ket qua a + b");
    int c = scanner.nextInt();
    while (c != a + b) {
      System.out.println("Nhap lai dap an");
      c = scanner.nextInt();
    }
    System.out.println("Dap an dung");


        int sum = 0;
    System.out.println("Nhap vao 1 so");
    int num = scanner.nextInt();
    while (num != -1){
      sum += num;
      System.out.println("Nhap vao 1 so");
      num = scanner.nextInt();
    }
    System.out.printf("Tong cac so vua nhap la %d", sum);
*/


/* do-while - loop

  do {
    statements;
  } while (condition);

    int sum = 0;
    int num;
    do {
      System.out.println("Nhap vao 1 so");
      num = scanner.nextInt();
      if (num != -1) sum += num;
    } while (num != -1);
    System.out.println(sum);
*/
    /* break - continue

    for (int i = 0; i < 10; i++) {
      if (i % 2 != 0) {
        continue;
      }
      System.out.println(i);
    }


    for (int i = 1; i < 10; i++) {
      if (i % 5 == 0) {
        break;
      }
      System.out.println(i);
    }
*/

  }
}