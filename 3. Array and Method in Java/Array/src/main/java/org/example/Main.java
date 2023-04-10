package org.example;

import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

/*  Array:

- Biến đặc biệt, lưu trữ được nhiều giá trị;
- Các giá trị cùng kiểu dữ liệu, khác nhau về chỉ số;
- Tên mảng, các phần tử, chỉ số, độ dài;

******* Khai báo mảng ****************************************************************

      elementType[] arrayRefVar;

      elementType: kiểu dữ liệu các phần tử trong mảng;
      arrayRefVar: tên mảng;

-   Khi khai báo biến mảng thì sẽ không có việc cấp phát bộ nhớ ngay cho các phần tử
của mảng. Chỉ có việc cấp phát bộ nhớ cho tham chiếu đến mảng.
-   Nếu không gắn tham chiếu đến mảng thì giá trị của biến mảng là null

Ví dụ: khai báo mảng số thực myList:
      double[] myList;
myList là 1 biến chứa tham chiếu đến 1 mảng
Tuy nhiên tường gọi myList là 1 mảng
******* Khởi tạo mảng ****************************************************************

      arrayRefVar = new elementType[arraySize];

************ Khai báo, khởi tạo và gắn tham chiếu cho biến mảng ********************

    elementType[] arrayRefVar =  new elementType[arraySize];
hoặc
   elementType arrayRefVar[] = new elementType[arraySize];

************ Gán giá trị cho các phần tử mảng *************************************

  arrayRefVar[index] = value;

Ví dụ: khai báo String gồm 10 phần tử:
str là biến mảng
new String[10] là đối tượng mảng

    String[] str = new String[10];

    int[] array = new int[5];
    array[0] = 0;
    array[1] = 1;
    array[2] = 2;
    array[3] = 3;
    array[4] = 5;

 */
    //--------------Khởi tạo nhanh mảng-------------
    String[] str = {"h","e","l","l","o"};
    int[] nums = {1,2,3,4};


    //-----------------Cách khác----------------------
    double[] arr;
    int size = 5;
    arr = new double[size];

    //*Nhập liệu cho mảng
    System.out.println("Input data for array");
    for (int i = 0; i < arr.length; i++){
      System.out.printf("arr[%d] = ", i);
      arr[i] = scanner.nextDouble();
    }

   //*Hiển thị dữ liệu mảng

    System.out.println("Show data of array:");
    for (double i: arr){ //for-each: Dùng trong trường hợp không thay đổi dữ liệu mảng
      System.out.println(i);
    }

    //Tìm max

    double max = arr[0];
    for (double num: arr){
      if (num > max) max = num;
    }
    System.out.println("Max: " + max);

    //Sắp xếp mảng

    double temp;
    for (int i = 0; i < arr.length - 1; i++){
        if (arr[i] > arr[i+1]) {
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
      }
    }
    System.out.println("Sắp xếp mảng: ");
    for (double num:arr){
      System.out.println(num);
    }
  }
}


