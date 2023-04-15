package org.example;

import java.util.Scanner;

public class NhanVien {

  public static void main(String[] args) {
//    NhanVien nv1 = new NhanVien();
//    System.out.println("Nhap thong tin nhan vien");
//    nv1.inputInfo();
    NhanVien nv1 = new NhanVien("A", 20,"Hue",5000000,200);
    nv1.printInfo();
    System.out.println("Tien luong " + nv1.tienLuong);
    System.out.println("Tien thuong " + nv1.tinhThuong());
    System.out.println("Tien Luong + Thuong: " + nv1.tienLuongCongThuong());
  }
/****************************************************************/
  public static Scanner scanner = new Scanner(System.in);
  private String ten;
  private int tuoi;
  private String diaChi;
  private double tienLuong;
  private int tongGioLam;

  public NhanVien() {
  }

  public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
    this.ten = ten;
    this.tuoi = tuoi;
    this.diaChi = diaChi;
    this.tienLuong = tienLuong;
    this.tongGioLam = tongGioLam;
  }

  public void inputInfo() {
    System.out.println("Ten");
    this.ten = scanner.nextLine();
    System.out.println("Tuoi");
    this.tuoi = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Dia chi");
    this.diaChi = scanner.nextLine();
    System.out.println("Tien luong");
    this.tienLuong = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Tong gio lam");
    this.tongGioLam = scanner.nextInt();
  }

  public void printInfo() {
    System.out.println(
        "NhanVien {" + "ten='" + ten + '\'' + ", tuoi = " + tuoi + ", diaChi = '" + diaChi + '\''
            + ", tienLuong = " + tienLuong + ", tongGioLam = " + tongGioLam + '}');
  }
  public double tinhThuong(){
    if (this.tongGioLam >= 200)
      return this.tienLuong*0.2;
    else if (this.tongGioLam >= 100)
      return this.tienLuong*0.1;
    else return 0;
  }
  public double tienLuongCongThuong(){
    return this.tienLuong + this.tinhThuong();
  }
}
