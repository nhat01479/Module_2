package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
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
    }
}
