package org.example;

public class Main {
    public static void main(String[] args) {
        Runnable myThread = new MyThread();
//        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread2 = new Thread(myThread);


//        MyThread2 myThread2 = new MyThread2();

        thread.start();
        thread2.start();
//        myThread2.start();

    }
}