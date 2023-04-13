package org.example;
import java.util.LinkedList;
import java.util.Scanner;

//[Bài tập] Tìm chuỗi tăng dần có độ dài lớn nhất
public class BaiTap {
 //   [Bài tập] Tìm chuỗi tăng dần có độ dài lớn nhất

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Nhap chuoi ");
//        String str = scanner.nextLine();
//        String str = "degbcde";
//        char[] chars = str.toCharArray();
//
//        int minASCI = (int) chars[0];
//        String result = String.valueOf(chars[0]);
//        for (int i = 0; i < chars.length - 1; i++) {
//            if ((int) chars[i] < (int) chars[i + 1]) {
//                minASCI = (int) chars[i];
//                result += chars[i + 1];
//            }
//        }
//        System.out.println(result);
//    }
        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Tìm chuỗi tăng dần có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) { //Vòng lặp bên ngoài
            //Khai báo một linked list trung gian các kí tự của chuỗi tăng dần
            LinkedList<Character> list = new LinkedList<>();
            //thêm kí tự thứ i vào trong list
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) { //vòng lặp bên trong
                //Kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong list hay không
                if (string.charAt(j) > list.getLast()) {
                    //Nếu có thì thêm vào trong list
                    list.add(string.charAt(j));
                }
            }
            //So sánh kích cỡ của list trung gian và list chứa chuỗi tăng dần có kích thước lớn nhất
            if (list.size() > max.size()) {
                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Hiển thị chuỗi tăng dần dài nhất
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
/*********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:                                           *
 * 	1 vòng lặp bên ngoài = n;                                                     *
 * 	1 vòng lặp bên trong = n - 1;                                                 *
 *  1 câu lệnh = 1                                                                *
 * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2);                                                                *
 * 	=> Độ phức tạp bài toán này là O(n^2)                                         *
 *********************************************************************************/
}
