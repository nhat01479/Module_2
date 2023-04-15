package org.example;
//[Thực hành] Static Property
public class Car {

  public static void main(String[] args) {
    Car car1 = new Car("BMW","Black");
    System.out.println(Car.numberOfCar);
    Car car2 = new Car("Mercedes","White");
    System.out.println(Car.numberOfCar);

  }
  private String name;
  private String color;
  public static int numberOfCar; //Khai báo là static nên trường này chỉ lấy bộ nhớ 1 lần duy nhất

  public Car(String name, String color) {
    this.name = name;
    this.color = color;
    numberOfCar++;
  }
}
