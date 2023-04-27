package org.example;

import java.util.Queue;

public class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }

    class Node{
        private int data;
        private Node link;
        public Node(int data) {
            this.data = data;
            this.link = null;
        }
        public int getData(){
            return this.data;
        }
    }


    public void enQueue(int data){
        Node temp = new Node(data);
        if (front == null) front = temp;
        else rear.link = temp;
       rear = temp;
        rear.link = front;
    }
    public Node deQueue(){
        if (front == null) return null;
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null) this.rear = null;
        return temp;
    }
    public void displayQueue(){
        Node temp = front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp.link != front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d\n", temp.data);
    }

}
