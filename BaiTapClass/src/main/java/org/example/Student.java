package org.example;

import java.util.Scanner;

public class Student {

  public static void main(String[] args) {
    Student student1 = new Student();
    student1.inputInfo();
    student1.showInfo();
    if (student1.checkHocBong()) {
      System.out.println("Được học bổng");
    } else {
      System.out.println("Không được học bổng");
    }
  }
  /**************************************************************/
  public static Scanner scanner = new Scanner(System.in);
  private String maSinhVien;
  private double diemTrungBinh;
  private int tuoi;
  private String lop;

  public Student() {
  }

  public Student(String maSinhVien, double diemTrungBinh, int tuoi, String lop) {
    this.maSinhVien = maSinhVien;
    this.diemTrungBinh = diemTrungBinh;
    this.tuoi = tuoi;
    this.lop = lop;
  }

  public String getMaSinhVien() {
    return maSinhVien;
  }

  public double getDiemTrungBinh() {
    return diemTrungBinh;
  }

  public int getTuoi() {
    return tuoi;
  }

  public String getLop() {
    return lop;
  }

  public void setMaSinhVien(String maSinhVien) {
    if (maSinhVien.length() == 8)
      this.maSinhVien = maSinhVien;
  }

  public void setDiemTrungBinh(double diemTrungBinh) {
    if(diemTrungBinh >= 0 && diemTrungBinh <= 10)
      this.diemTrungBinh = diemTrungBinh;
  }

  public void setTuoi(int tuoi) {
    if (tuoi >= 18)
      this.tuoi = tuoi;
  }

  public void setLop(String lop) {
    if (lop.charAt(0) == 'A' || lop.charAt(0) == 'C')
      this.lop = lop;
  }
  public void inputInfo(){
    do {
      System.out.println("Nhập mã sinh viên gồm 8 ký tự: ");
      this.maSinhVien = scanner.nextLine();
    }while (maSinhVien.length() != 8);
    do {
      System.out.println("Nhập điểm trung bình từ 0.0 - 10.0: ");
      this.diemTrungBinh = scanner.nextDouble();
    }while(diemTrungBinh < 0 || diemTrungBinh > 10);
    do {
      System.out.println("Nhập tuổi >=18 ");
      this.tuoi = scanner.nextInt();
      scanner.nextLine();
    }while(tuoi < 18);
    do {
      System.out.println("Nhập lớp bắt đầu = ký tự 'A' hoặc 'C' ");
      this.lop = scanner.next();
    }while (lop.charAt(0) != 'A' && lop.charAt(0) != 'C');
  }
  public void showInfo(){
    System.out.println("MSV: " + this.maSinhVien + " - DTB: " + this.diemTrungBinh + " - Tuoi " + this.tuoi + " - Lop: " + this.lop);
  }
  public boolean checkHocBong(){
    return this.diemTrungBinh >= 8;
  }
}
/*
* - Điểm trung bình: từ 0.0 – 10.0
* - Tuổi: Phải lớn hơn hoặc bằng 18
* - Lớp: Phải bắt đầu bởi kí tự ‘A’ hoặc kí tự ‘C’
* Constructor không tham số. Constructor đầy đủ tham số. Các hàm get/set
* */