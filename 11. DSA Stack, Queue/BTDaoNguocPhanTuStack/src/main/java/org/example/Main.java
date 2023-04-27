package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int[] numbers = {3, 5, 7, 9, 10};
        for (int num: numbers){
            stack.push(num);
        }
        System.out.println("Mảng stack: " + stack);

        Stack<Integer> reverseStack = new Stack<>();
        while (!stack.isEmpty()){
            reverseStack.push(stack.pop());
        }
        System.out.println("Đảo mảng stack: " + reverseStack);

        /**************************************************/
        Stack<String> wStack = new Stack<>();
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++){
            wStack.push(String.valueOf(str.charAt(i)));
        }

    /*
        Stack<String> newStack = new Stack<>();
        while (!wStack.isEmpty()){
            newStack.push(wStack.pop());
        }
        String newStr = "";
        for (String x: newStack){
            newStr += x;
        }

     */
        String newStr = "";
        while (!wStack.isEmpty()){
            String mWord = wStack.pop();
            newStr += mWord;
        }
        System.out.println("Đảo chuỗi: " + newStr);

    }
}