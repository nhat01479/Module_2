package org.example;
import java.util.Scanner;

public class ReadNumber {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Nhap so can doc");
    int num = scanner.nextInt();

    String result = "";
    if (num < 0 || num > 999) {
      result = "Out of ability";
    } else if (num == 0) {
      result = "zero";
    } else {
      int hundreds = num / 100;
      int tens = (num % 100) / 10;
      int ones = num % 10;
      if (hundreds > 0) {
        result += readOneDigit(hundreds) + " hundred";
        if (tens > 0 || ones > 0) {
          result += " and ";
        }
      }
      if (tens == 0) {
        result += readOneDigit(ones);
      } else if (tens == 1) {
        result += readTwoDigits(num % 100);
      } else {
        result += readTensDigit(tens);
        if (ones > 0) {
          result += " " + readOneDigit(ones);
        }
      }
    }
    System.out.println(result);
  }

  public static String readOneDigit(int digit) {
    switch (digit) {
      case 1:
        return "one";
      case 2:
        return "two";
      case 3:
        return "three";
      case 4:
        return "four";
      case 5:
        return "five";
      case 6:
        return "six";
      case 7:
        return "seven";
      case 8:
        return "eight";
      case 9:
        return "nine";
      default:
        return "";
    }
  }

  public static String readTensDigit(int digit) {
    switch (digit) {
      case 2:
        return "twenty";
      case 3:
        return "thirty";
      case 4:
        return "forty";
      case 5:
        return "fifty";
      case 6:
        return "sixty";
      case 7:
        return "seventy";
      case 8:
        return "eighty";
      case 9:
        return "ninety";
      default:
        return "";
    }
  }

  public static String readTwoDigits(int num) {
    switch (num) {
      case 10:
        return "ten";
      case 11:
        return "eleven";
      case 12:
        return "twelve";
      case 13:
        return "thirteen";
      case 14:
        return "fourteen";
      case 15:
        return "fifteen";
      case 16:
        return "sixteen";
      case 17:
        return "seventeen";
      case 18:
        return "eighteen";
      case 19:
        return "nineteen";
      default:
        return "";
    }
  }
}
