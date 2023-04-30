package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "Hue");
        Student student2 = new Student("Nam", 26, "Ha Noi");
        Student student3 = new Student("Anh", 38, "TP Ho Chi Minh" );
        Student student4 = new Student("Tung", 32, "Hue" );
        Student student5 = new Student("Hien", 28, "Gia Lai" );
        Student student6 = new Student("Ngoc", 27, "Hue" );
        Student student7 = new Student("Tien", 31, "Hai Phong" );
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        show(studentList);

        System.out.println("Sort by Name (use Comparable");
        Collections.sort(studentList);
        show(studentList);

        System.out.println("Sort by Age");
        AgeComparator comparator = new AgeComparator();
        studentList.sort(comparator); // Hoặc  Collections.sort(studentList, comparator);
        show(studentList);

        System.out.println("----------Stack--------------");
        Stack<Student> stack1 = new Stack<>();
        Stack<Student> stack2 = new Stack<>();
        for (Student student: studentList){
            if (student.getAddress() == "Hue"){
                stack1.push(student);
            }
            else stack2.push(student);
        }
        show(stack1);
        show(stack2);
        stack1.addAll(stack2);
        System.out.println("Sap xep theo dia chi o Hue");
        show(stack1);

    }
    public static void show(List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
