package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        boolean check = checkBracket(str);
        System.out.println("Dùng dấu ngoặc đúng hay không? " + check);

    }
    public static boolean checkBracket(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '('){
                stack.push(sym);
            }
            else if (sym == ')'){
                if (stack.isEmpty())
                    return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}