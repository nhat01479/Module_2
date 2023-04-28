package org.example;
//Tổ chức dữ liệu hợp lý
import java.util.*;

public class DemergingQueue {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Thanh", "Female", "01/01/1998");
        students[1] = new Student("Tiến", "Male", "10/01/1996");
        students[2] = new Student("Toàn", "Male", "01/01/1997");
        students[3] = new Student("Anh", "Female", "10/01/1998");
        students[4] = new Student("Chiến", "Male", "25/10/2000");
        students[5] = new Student("Quân", "Male", "02/09/2000");
        students[6] = new Student("Linh", "Male", "25/10/1993");
        students[7] = new Student("Trang", "Female", "25/11/2000");
        students[8] = new Student("Hiền", "Female", "25/10/2000");
        students[9] = new Student("Ngọc", "Female", "25/10/2000");


        ComparatorAge comparator = new ComparatorAge();
        Arrays.sort(students, comparator);
        System.out.println("               Danh sách theo ngày sinh");
        for (Student student: students){
            System.out.println(student);
        }

        Queue<Student> male = new LinkedList<>();
        Queue<Student> female = new LinkedList<>();
        Queue<Student> data = new LinkedList<>();

        for (Student student: students){
            if (student.getGender() == "Female"){
                female.add(student);
            }
            if (student.getGender() == "Male"){
                male.add(student);
            }
        }
        while (!female.isEmpty()){
            data.add(female.remove());
        }
        while (!male.isEmpty()){
            data.add(male.remove());
        }
        System.out.println("               Danh sách theo giới tính và ngày sinh");
        for (Student student: data){
            System.out.println(student);
        }

    }
}