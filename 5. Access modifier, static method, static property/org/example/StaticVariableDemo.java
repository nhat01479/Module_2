package org.example;
/*  StaticVariableDemo

-   Còn gọi là biến của lớp (class variable).

-   Các thành phần static TRỰC THUỘC LỚP thay vì trực thuộc đối tượng;

-   Khi khai báo 1 biến là static thì biến đó được gọi là biến tĩnh, hay biến static.

-   Biến static được khai báo trong một class với từ khóa "static", phía bên ngoài các phương thức, constructor và block.

-   Biến static có thể được sử dụng để THAM CHIẾU THUỘC TÍNH CHUNG CỦA TẤT CẢ ĐỐI TƯỢNG (mà không là duy nhất cho mỗi đối tượng),
Ví dụ như tên công ty của nhân viên, tên trường học của các sinh viên, ...
-   Không cần khởi tạo đối tượng vẫn có thể sử dụng các thành phần static.

-   Biến static lấy bộ nhớ CHỈ MỘT LẦN trong Class Area tại thời gian tải lớp đó.

-   Lợi thế của biến static: giúp tiết kiệm bộ nhớ.

* */
public class StaticVariableDemo {

  public static void main(String[] args) {

  }
}



/*
public class Student {

  public static void main(String[] args) {
    Student student1 = new Student(001, "John");
    Student student2 = new Student(002, "Doe");
    student1.display();
    student2.display();
  }

  int rollno;
  String name;
  static String college = "BackKhoa";     //Giả sử có 1000 sinh viên, các sinh viên có rollno và name là duy nhất, college là thuộc tính chung. Nếu tạo trường college là static thì trường này chi lấy bộ nhớ 1 lần duy nhât
  Student(int r, String n) {
    rollno = r;
    name = n;
  }
//  static void change(){
//    college = "NgoaiNgu";           //Phương thức static truy cập vào biến static và thay đổi giá trị của nó
//  }
  void display() {
    System.out.println(rollno + " " + name + " " + college);
  }
}

*/
/*
class Counter {
  static int count = 0;

  // Sẽ lấy bộ nhớ chỉ 1 lần và giữ lại giá trị của nó
  // Kết quả in ra 3 dòng: 1,2,3
  // Nếu không dùng static sẽ in ra 3 dòng: 1,1,1
  // int count = 0; count ở đây là biến instance (biến toàn cục)
  Counter() {
    count++;
    System.out.println(count);
  }
  public static void main(String args[]) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();
  }
}
*/