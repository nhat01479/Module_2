package org.example;
import java.util.Scanner;
public class BMI {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Chieu cao (m): ");
    double height = scanner.nextDouble();
    System.out.print("Can nang (kg): ");
    double weight = scanner.nextDouble();
    double bmi = weight / Math.pow(height, 2);
    System.out.println("BMI: " + bmi);
    if (bmi < 0)
      System.out.println("Nhap sai");
    else if (bmi < 18.5)
        System.out.println("Underweight");
    else if (bmi < 25)
        System.out.println("Normal");
    else if (bmi < 30)
        System.out.println("Overweight");
    else  System.out.println("Obese");
  }
}

/**
 double weight, height, bmi;
 System.out.print("Your weight (in kilogram):");
 weight = scanner.nextDouble();

 System.out.print("Your height (in meter):");
 height = scanner.nextDouble();
 bmi = weight / Math.pow(height, 2);
 System.out.printf("%-20s%s", "bmi", "Interpretation\n");

 if (bmi < 18)
 System.out.printf("%-20.2f%s", bmi, "Underweight");
 else if (bmi < 25.0)
 System.out.printf("%-20.2f%s", bmi, "Normal");
 else if (bmi < 30.0)
 System.out.printf("%-20.2f%s", bmi, "Overweight");
 else
 System.out.printf("%-20.2f%s", bmi, "Obese");
 }
 }
 */