package org.example;

public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enQueue(10);
        circularQueue.enQueue(8);
        circularQueue.enQueue(5);
        circularQueue.displayQueue();
        System.out.println(circularQueue.deQueue().getData()); //10
        System.out.println(circularQueue.deQueue().getData()); //8
        circularQueue.enQueue(8);
        circularQueue.enQueue(5);
        circularQueue.displayQueue();

    }
}
