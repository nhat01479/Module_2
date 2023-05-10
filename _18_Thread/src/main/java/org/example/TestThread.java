package org.example;

public class TestThread implements Runnable {
    public int tong;

    public TestThread() {
        this.tong = 1000;
    }

    public synchronized void rutTien() throws InterruptedException {
        if (tong > 0) {
//            Thread.sleep(1000);
            tong = tong - 1000;
            System.out.println(tong);
        } else {
            System.out.println("Het tien");
        }
    }

    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread test = new TestThread();

        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        thread1.start();
        thread2.start();


    }

}
