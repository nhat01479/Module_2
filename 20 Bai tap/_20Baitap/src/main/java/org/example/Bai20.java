package org.example;

import java.util.Stack;

public class Bai20 {
    public static boolean checkBracket(String str, char open, char close){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == open)
                stack.push(ch);
            else if (ch == close){
                if (stack.isEmpty())
                    return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "({()})";
        boolean check = checkBracket(str, '(',')') && checkBracket(str, '[',']') && checkBracket(str, '{','}');
        System.out.println(check);
    }
}
