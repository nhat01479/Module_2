package org.example;

public class GenericStackClient {
    public static void main(String[] args) {

        System.out.println("1. Stack of Integers");
        stackOfIntegers();
        System.out.println("2. Stack of Strings");
        stackOfStrings();
    }
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Alo");
        stack.push("Hello");
        stack.push("World");
        stack.push("Xin chao");
        System.out.println("Size: " + stack.size());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("Size: " + stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Size: " + stack.size());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("Size: " + stack.size());
    }
}
