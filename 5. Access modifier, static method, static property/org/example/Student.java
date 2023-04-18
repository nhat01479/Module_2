package org.example;

//[Bài tập] Xây dựng lớp chỉ ghi trong Java
public class Student {

  public static void main(String[] args) {
    Student student = new Student();
    student.setName("John Doe");
    student.setClasses("CO3");
    System.out.println(student.toString());
  }

  private String name = "John";
  private String classes = "C02";

  public Student() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setClasses(String classes) {
    this.classes = classes;
  }

  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", classes='" + classes + '\'' +
        '}';
  }
}
