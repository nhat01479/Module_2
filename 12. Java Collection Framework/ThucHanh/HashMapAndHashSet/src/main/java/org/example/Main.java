package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        System.out.println("----- Map: chỉ chứa key không trùng nhau -----");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(1, student1);
        for (Integer key: studentMap.keySet()){
            System.out.println(studentMap.get(key));
        }

        System.out.println("----- Set: chỉ chứa các đối tượng không trùng nhau -----");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student: students){
            System.out.println(student);
        }
    }
}