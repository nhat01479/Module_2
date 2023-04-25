package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listArray = new ArrayList<Integer>();
        listArray.add(1);
        listArray.add(2);
        listArray.add(3);
        System.out.println("-------------------------------");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(1);
        list.addLast(5);
        list.add(1,6);
        //add mang
        list.addAll(Arrays.asList(10,11,12));
        list.addAll(listArray);
        //Sap xep
        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
        //So lan xuat hien cua phan tu
        System.out.println(Collections.frequency(list,3));


        //Duyet va in ra cac phan tu
//        list.forEach(x -> System.out.printf("%d\t\t", x));
        for (Integer list1: list){
            System.out.printf("%d\t\t", list1);
        }
        System.out.println();
        System.out.println(list);
    }
}