package org.example;
//Ví dụ Heap và Stack
public class Square {
  public static void main(String[] args) {
    int x = 5;
    Square square = new Square(x);
    square.xinChao(square);
  }
  int width;
  //static int width;
  public Square(int width){
    this.width = width;
  }
  public void chuVi(){
    System.out.println("Chu vi hình vuông là: " + 4*this.width);
  }
  public static void xinChao(Square square){
    String str = "Xin chào";
    System.out.println(str);
    square.chuVi();
  }
}
