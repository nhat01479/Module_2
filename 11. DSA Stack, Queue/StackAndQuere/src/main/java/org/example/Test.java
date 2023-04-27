package org.example;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(5);
        stack.add(6);
        stack.add(3);
        stack.add(2,10);
        System.out.println(stack.empty());
        System.out.println(stack.search(1));
        System.out.println(stack.size());
        System.out.println("--------");
        for (Integer s: stack){
            System.out.println(s);
        }
        System.out.println("Pop");
        while ((!stack.isEmpty())){
            stack.pop();
        }
        for (Integer s: stack){
            System.out.println(s);
        }
    }
}
