package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String fullName;
    private String gender;
    private LocalDate dob;

    public Student(String fullName, String gender, String dob) {
        this.fullName = fullName;
        this.gender = gender;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dob = LocalDate.parse(dob,formatter);

    }

//    public Student() {
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
//        return "Tên: " + getFullName() +" - Giới tính: " + getGender() + " - DOB: " +getDob();
        return  String.format("Tên: %-7s    ||    Giới tính: %-6s    ||    Ngày sinh: %-10s", getFullName(), getGender(), getDob());
    }
}
