package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /* Class và Object
        Class
 -	Là đơn vị thực thi cơ bản trong Java
 -	Quy định thuộc tính và hành vi của các đối tượng
 -	Khai báo lớp ==> sẽ khai báo 1 KIỂU DỮ LIỆU MỚI ==> để có thể khởi tạo các đối tượng thuộc kiểu dữ liệu đó

-	Cú pháp:
			class class_name {
				//class body
			}

		+ class body: nơi khai báo các thành phần:
		    .	data field (trường dữ liệu)
		    .   phương thức (method): Trong một lớp có thể có nhiều phương thức cùng tên nhưng khác nhau về tham số (kiểu, số lượng và thứ tự) - Overload - nạp chồng
		    .	contructor: phương thức khởi tạo ==> để khởi tạo các đối tượng của lớp
					        có TÊN TRÙNG VỚI TÊN LỚP
				        	1 lớp có thể có nhiều contructor trùng tên nhưng khác tham số
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
			Person personObj;           //khai báo biến: biến personObj được khai báo và không trỏ đến đối tượng nào, có giá trị null
			personObj = new Person();   //khởi tạo đối tượng new Person() và lưu vào vùng nhớ, địa chỉ vùng nhớ được gán cho biến personObj

-	Truy xuất các thành phần của đối tượng: thông qua biến trỏ đến đối tượng

			personObj.property;

-	Gọi phương thức của đối tượng:

			personObj.method();

-   Khai báo getter/ setter
        + getter:       public returnType getPropertyName() {}    //return this.property = property;
        + setter:       public returnType setPropertyName()	{}    //this.property = property;
        + boolean:      public boolean isPropertyName()	{}
-   this: đại diện cho đối tượng hiện tại

 */
    }
}