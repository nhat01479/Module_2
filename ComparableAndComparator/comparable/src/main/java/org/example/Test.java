package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nhâa",22));
        students.add(new Student("Nhân",22));
        students.add(new Student("Thư",20));
        students.add(new Student("Anh",21));
        students.add(new Student("Tiến",21));
        students.add(new Student("Trang",21));
        students.add(new Student("Ngọc",21));

        System.out.println("list student");
        for (Student student: students) {
            System.out.println(student.toString());
        }

        Collections.sort(students);
        System.out.println("After sort");
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
