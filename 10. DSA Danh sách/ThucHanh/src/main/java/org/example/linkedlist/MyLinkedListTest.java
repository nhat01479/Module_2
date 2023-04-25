package org.example.linkedlist;

import org.example.list.MyListTest;
import org.w3c.dom.Node;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("----------- Testing -----------");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.printList();
        System.out.println("----------- Testing -----------");
        linkedList.addFirst(9);
        linkedList.add(2,11);
        linkedList.add(2,14);
        linkedList.add(2,11);
        linkedList.printList();


    }
}
