package org.example;
//Luồng thực thi khi tạo 1 đối tượng từ class con
class Faculty extends Employee {
    public Faculty() {
        System.out.println("Faculty performing its tasks");
    }

    public static void main(String[] args) {
        new Faculty();
    /* Tạo đối tượng mới của lớp Faculty bằng toán tử new
    *  Phương thức này gọi contructor không tham số của lớp Employee
    *  COntructor không tham số của lớp Employee gọi contructor của lớp Person
    * ==>
    * Thực thi contructor theo thứ tự các lớp: Person ==> Employee ==> Faculty
        Person performing its tasks!
        Employee overloading its tasks
        Employee performing its tasks!
        Faculty performing its tasks
    * */
    }
}

class Employee extends Person {
    public Employee() { //Contructor không tham số
        this("Employee overloading its tasks"); //Gọi contructor có tham số của nó với tham số là chuỗi
        System.out.println("Employee performing its tasks!");   //In ra thông báo
    }
    public Employee(String s) {
        System.out.println(s);
    }
}

class Person {
    public Person() {
        System.out.println("Person performing its tasks!");
    }
}
