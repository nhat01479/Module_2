package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List: ");
        for (Integer num : list) {
            System.out.println(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.remove(1);
        System.out.println("List2: ");
        for (Integer num : list2) {
            System.out.println(num);
        }
//        list.retainAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
        System.out.println("List3");
        ArrayList<Integer> list3 = (ArrayList<Integer>) list2.clone();
        list3.addAll(list);
        System.out.println(list3);
        System.out.println(list3.size());
        list3.set(4, 100);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        System.out.println("LinkedList");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.addFirst(3);
        list1.addLast(4);
        System.out.println(list1);
        list1.remove();
        Iterator<Integer> iterator = list1.iterator();
        System.out.println("Duyệt theo iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
