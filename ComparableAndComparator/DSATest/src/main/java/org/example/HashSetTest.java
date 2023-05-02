package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        System.out.println("------------HashSet---------------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Triangle");
        hashSet.add("Circle");
        hashSet.add("Square");
        hashSet.add("Circle");
        hashSet.add("Rectangle");
        System.out.println(hashSet);    //[Circle, Rectangle, Square] chỉ chứa các phần tử không trùng nhau

//        HashSet<String> hashSet1 = new HashSet<>(hashSet);
//        System.out.println(hashSet1);
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------TreeSet: sắp xếp các phần tử tăng dần---------------");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Square");
        treeSet.add("Circle");
        treeSet.add("Circle");
        treeSet.add("Rectangle");
        treeSet.add("Triangle");
        for (String s : treeSet) {
            System.out.println(s);
        }

    }
}
