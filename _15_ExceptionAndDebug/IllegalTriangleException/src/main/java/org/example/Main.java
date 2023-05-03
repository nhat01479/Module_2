package org.example;

public class Main {
    public static void main(String[] args) { //Nhận ngoại lệ
        try {
            Triangle triangle = new Triangle(2,3,5);
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}