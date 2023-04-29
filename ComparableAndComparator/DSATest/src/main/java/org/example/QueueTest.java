package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        /*
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(5);
        System.out.println(queue.peek());
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        */
        CustomComparator comparator = new CustomComparator();
        Queue<String> queue1 = new PriorityQueue<>(comparator);
        queue1.add("Hello");
        queue1.add("Queue");
        queue1.add("Wind");
        queue1.add("Wa");
        queue1.add("Number");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
    }

}

class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}