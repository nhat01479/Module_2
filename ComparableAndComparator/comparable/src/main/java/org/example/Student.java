package org.example;
//Triển khai Comparable
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Ghi đè lại phương thức compareTo()
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Tên: %-7s - Tuổi: %2s",getName(),getAge());
    }


}
