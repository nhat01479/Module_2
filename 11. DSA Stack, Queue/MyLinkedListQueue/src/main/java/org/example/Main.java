package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(2);
        queue.add(5);
        System.out.println(queue.add(5));
        System.out.println(queue.remove());
    }
}