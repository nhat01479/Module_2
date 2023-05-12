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
/*Anonymous
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println("A");
                }
            }
        });
        t.start();

        Thread t1 = new Thread() {
            @Override
            public void run(){
                for (int i = 0; i < 10; i++){
                    System.out.println("A");
                }
            }
        };
*/
    }
}