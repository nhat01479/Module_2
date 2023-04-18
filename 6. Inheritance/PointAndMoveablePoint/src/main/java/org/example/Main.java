package org.example;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablepoint = new MoveablePoint(1,1,1,1);
        System.out.println(moveablepoint);
        moveablepoint.move();
        moveablepoint.move();
        moveablepoint.move();
        System.out.println("Sau khi chay");
        System.out.println(moveablepoint);
    }
}