package org.example;

public class Triangle {
    private double a, b, c;
    public Triangle() {
    }
    public Triangle(double a, double b, double c) throws IllegalTriangleException{  //Quăng ngoại lệ
        if (a <= 0 || b <= 0 || c<= 0) {
            throw new IllegalTriangleException("Cạnh phải >0");
        }
        if (a + b <= c || b+c <= a || a+c <=b){
            throw new IllegalTriangleException("Không phải cảnh của tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
