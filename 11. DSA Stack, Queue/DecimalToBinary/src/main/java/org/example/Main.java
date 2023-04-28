package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int num = 15;
        int num1 = Math.abs(num);
        do {
            stack.push(num1 % 2);
            num1 /= 2;
        } while (num1 != 0);

        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }
        if (num < 0) str = "-" + str;
        System.out.println(str);

    }
}