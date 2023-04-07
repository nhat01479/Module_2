package org.example;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Nhap so can doc");
    int num = scanner.nextInt();
/**
    String[] ones = {"", "mốt", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    String[] hundreds = {"", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};

    if (num < 0 || num > 999)
      System.out.println("Không hợp lệ");
    else if (num == 0)
      System.out.println("Không");
    else if (num == 1) {
      System.out.println("Một");
    } else {
      int digit1 = num % 10;
      int digit2 = (num / 10) % 10;
      int digit3 = (num / 100) % 10;

      String result = "";
      if (digit3 != 0) {
        result += hundreds[digit3] + " ";
      }
      if (digit2 != 0) {
        if (digit2 == 1) {
          result += ones[digit1 + 10];
        } else {
          result += tens[digit2] + " ";
          if (digit1 != 0) {
            result += ones[digit1];
          }
        }
      } else {
        if (digit1 != 0) {
          result += ones[digit1];
        }
      }

      System.out.println("Số " + num + " đọc thành chữ là: " + result);
    }
 */

  }
}
