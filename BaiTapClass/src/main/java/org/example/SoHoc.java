package org.example;

import java.util.Scanner;

public class SoHoc{

  public static void main(String[] args) {
    SoHoc sohoc = new SoHoc();
    sohoc.inputInfo(30,15);
    System.out.println(sohoc.division(sohoc.getNumber1(), sohoc.getNumber2()));
    System.out.println(sohoc.multi(sohoc.getNumber1(), sohoc.getNumber2()));
  }
  public static Scanner sc = new Scanner(System.in);

  private int number1, number2;

  public SoHoc() {
  }

  public SoHoc(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public int getNumber1() {
    return this.number1;
  }

  public void setNumber1(int x) {
    this.number1 = x;
  }

  public int getNumber2() {
    return this.number2;
  }

  public void setNumber2(int y) {
    this.number2 = y;
  }
  public void inputInfo(int x, int y){
    this.number1 = x;
    this.number2 = y;
  }
  public void printInfo(){
    System.out.println(this.number1 + " - " + this.number2);
  }
  public int addition(int x, int y){
    return x + y;
  }
  public int subtrack(int x, int y){
    return x - y;
  }
  public int multi(int x, int y){
    return x * y;
  }
  public double division(double x, double y){
    return x/y;
  }
}
