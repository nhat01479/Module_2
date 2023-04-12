package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /* Class và Object
        -	Là đơn vị thực thi cơ bản trong Java
-	Quy định thuộc tính và hành vi của các đối tượng
-	Khai báo lớp ==> sẽ khai báo 1 KIỂU DỮ LIỆU MỚI ==> để có thể khởi tạo các đối tượng thuộc kiểu dữ liệu đó

-	Cú pháp:
			class class_name {
				//class body
			}

		+ class body: nơi khai báo các thành phần:
		    .	field (trường), phương thức (method)
		    .	contructor: phương thức khởi tạo ==> để khởi tạo các đối tượng của lớp
					có TÊN TRÙNG VỚI TÊN LỚP
					1 lớp có thể có nhiều contructor
					nếu không khai báo thì mặc định lớp có 1 contructor không có tham số

-	Quy tắc đặt tên: 	quy tắc lạc đà
				không trùng các từ khoá
				bắt đầu bằng ($, _, hoặc chữ cái)

-	Khởi tạo đối tượng (object): sau khi khai báo lớp

			class_name object_name = new class_name;

				class_name: tên lớp
				new: từ khoá để khởi tạo
				object_name: tên biến chứa tham chiếu đến đối tượng

-	Ví dụ:	Person personObj = new Person;
		hoặc
			Person personObj;
			personObj = new Person();

-	Truy xuất các thành phần của đối tượng:

			personObj.property

-	Gọi phương thức của đối tượng:

			personObj.method();
         */
    }
}