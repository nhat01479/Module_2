package org.example;

public class HoaDonCaPhe {

  public static void main(String[] args) {
    HoaDonCaPhe caPheDen = new HoaDonCaPhe("Ca phe den", 25000, 7);
    HoaDonCaPhe bacXiu = new HoaDonCaPhe("Bac xiu", 30000, 7);
    System.out.println(caPheDen.getTotal());
    System.out.println(bacXiu.getTotal());
//    System.out.println("Kiem tra so tien lon hon 200K: " + caPheDen.checkTotalLargeThan200());
//    System.out.println("Giam gia: " + caPheDen.getDiscount(10));
    System.out.println("Thanh tien: " + caPheDen.totalPayment(10));
    System.out.println("Thanh tien: " + bacXiu.totalPayment(10));
  }

  private String name;
  private double price;
  private double quantity;

  public HoaDonCaPhe(String name, double price, double quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getQuantity() {
    return this.quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public double getTotal() {
    return this.price * this.quantity;
  }

  public boolean checkTotalLargeThan200() {
    return this.quantity > 200000;
  }

  public double getDiscount(double x) {
    if (this.getTotal() > 200000) {
      return (x / 100) * this.getTotal();
    } else {
      return 0;
    }
  }

  public double totalPayment(double x) {
    return this.getTotal() - this.getDiscount(x);
  }
}
