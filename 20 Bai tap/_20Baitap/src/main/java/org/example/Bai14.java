package org.example;

import java.util.Scanner;
//Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
public class Bai14 {
    public static void main(String[] args) {
        //Bài toán: Hãy viết chương trình nhập vào 10 số nguyên, sau đó loại bỏ những giá trị trùng lặp.
        int[] mangNguyen = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 10 số nguyên bất kỳ:");
        for (int i = 0; i < mangNguyen.length; i++) {
            System.out.printf("Phần tử thứ %d: ", i + 1);
            mangNguyen[i] = scanner.nextInt();
        }
        //Tiến hành loại bỏ những giá trị trùng lặp:
        int[] trungGian = new int[10];//tạo 1 mảng trung gian
        boolean timThay;//tạo 1 biến để tìm đánh dấu tìm thấy giá trị giống nhau
        int count = 0;//tạo biến để đếm số lượng giá trị khác nhau được đưa vào mảng trungGian
        trungGian[0] = mangNguyen[0];//ban đầu đưa giá trị đầu tiên của mảng vào trungGian
        count++;//và đếm được 1 giá trị được đưa vào trungGian
        for (int i = 1; i < mangNguyen.length; i++) {//lấy từng giá trị ra
            timThay = false;//mỗi khi kiểm tra sự giống nhau thì cần set timThay thành false
            for (int j = 0; j < count; j++) {//rồi lấy từng giá trị trong trungGian ra để so sánh với giá trị mangNguyen[i]
                if (trungGian[j] == mangNguyen[i]) {//nếu giống nhau thì
                    timThay = true;//thì lật trạng thái tìm thấy thành true
                    break;//và thoát khỏi for trong không cần tìm thêm nữa
                }
            }
            if (!timThay) {//nếu giá trị mangNguyen[i] khác so với các giá trị trungGian[j],
                trungGian[count] = mangNguyen[i];//thì đưa giá trị mangNguyen[i] sang trungGian
                count++;//và đếm lên 1
            }
        }
        //In thử kết quả:
        //for(int i=0; i<count; i++){
        //    System.out.println(trungGian[i]);
        //}
        //=>Vậy là trong mảng trungGian chỉ chứa những giá trị khác nhau
        //Bây giờ cần chuyển trở lại mảng mangNguyen:
        mangNguyen = new int[count];//khai báo lại kích thước cho mangNguyen
        for (int i = 0; i < mangNguyen.length; i++) {//rồi tiến hành chuyển ngược trở lại các giá trị cho mangNguyen
            mangNguyen[i] = trungGian[i];
        }
        //In ra kết quả:
        System.out.println("Sau khi loại bỏ những giá trị giống nhau, ta được:");
        for (int i : mangNguyen) {
            System.out.println(i);
        }
    }
}
