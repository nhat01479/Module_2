package org.example;

public class WrapperClass {

    //Phương thức giúp chuyển qua lại giữa các kiểu dữ liệu
    public static void main(String[] args) {
        Integer a = new Integer(6);
        String x = "51";
        Integer.parseInt(x); //CHuyển chuỗi thành số

        Integer n = 5; //boxing;
        int m = a;  //unboxing;
        System.out.println(a);
        System.out.println(n);
        System.out.println(x);
        System.out.println(Integer.parseInt(x)+2);
    }
}
