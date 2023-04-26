package mylinkedlist;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList <Integer>myLinkedList=new MyLinkedList<>();
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(6);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0));
        myLinkedList.clear();
        System.out.println(myLinkedList.get(0));
    }
}