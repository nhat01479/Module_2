package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        Stack<Integer> stack = new Stack<>();
        for (Integer num : list) {
            stack.push(num);
        }
        System.out.println(stack);
        stack.search(3);
        System.out.println(stack.search(3));
        System.out.println(stack.push(24));
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
