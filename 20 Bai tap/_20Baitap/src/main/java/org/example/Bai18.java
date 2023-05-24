package org.example;

import java.util.Scanner;

public class Bai18 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
          boolean checkExeption;
          do {
              checkExeption = false;
              try {
                  boolean check;
                  do {
                      check = true;
                      System.out.println("Nhập");
                      Scanner in = new Scanner(System.in);
                      String s = in.next();
                      int start = in.nextInt();
                      int end = in.nextInt();

                      if ((s.length() > 0 && s.length() <= 100) && (start >= 0 && end <= s.length())){
                          System.out.println(s.substring(start, end));
                          check = false;
                      }
                      else {
                          System.out.println("Start và End không hợp lệ");
                      }
                  } while (check);
              } catch (Exception e) {
                  System.out.println("Nhập theo cú pháp: String (viết liền) - space - Start - space - End");
                  checkExeption = true;
              }
          } while (checkExeption);


    }
}
