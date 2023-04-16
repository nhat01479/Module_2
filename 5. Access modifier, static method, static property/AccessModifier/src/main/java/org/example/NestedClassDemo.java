package org.example;

import org.example.OuterClass.StaticNestedClass;

public class NestedClassDemo {

  public static void main(String[] args) {
    // Để truy cập lớp bên trong, phải tạo 1 đối tượng của lớp bên ngoài
    OuterClass outer = new OuterClass();

    // Sau đó tạo 1 đối tượng của lớp bên trong
    OuterClass.InnerClass inner = outer.new InnerClass();
    inner.innerShow();
    //hoặc
    OuterClass.InnerClass inner2 = new OuterClass(). new InnerClass();
    inner2.innerShow();

    //static nested class: có thể truy cập lớp bên trong mà không cần tạo một đối tượng của lớp bên ngoài
    OuterClass.StaticNestedClass nestedClass = new OuterClass.StaticNestedClass();
    nestedClass.staticNestedShow();
  }
}
/*********************************************************/
class OuterClass { //Outer class
//  public void outerShow(){
//    InnerClass inner = new InnerClass();
//    inner.innerShow();
//  }

 // static nested class
  static class StaticNestedClass{
      public void staticNestedShow(){
        System.out.println("Hello, đây là static nested class");
      }
  }
  // inner class (non-static)
  class InnerClass{
    public void innerShow(){
      System.out.println("Hello, đây là inner class");
    }
  }
}