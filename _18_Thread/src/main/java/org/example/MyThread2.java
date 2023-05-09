package org.example;
//Tạo Thread = cách kế thừa lớp Thread

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("B " + i);
        }
    }
}
