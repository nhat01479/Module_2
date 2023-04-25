package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listArray = new ArrayList<Integer>();
        listArray.add(1);
        listArray.add(2);
        listArray.add(3);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(1);
        list.addLast(5);
        list.add(1,6);

//        list.removeLast();
        System.out.println(list.remove(1));
        //        System.out.println(list.removeFirst());
        System.out.println(list);
    }
}