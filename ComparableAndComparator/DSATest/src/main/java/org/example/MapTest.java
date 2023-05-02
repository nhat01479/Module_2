package org.example;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        System.out.println("---------------- HashMap: không theo thứ tự key -----------------");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Triangle", 2);
        hashMap.put("Circle", 1);
        hashMap.put("Square", 4);
        hashMap.put("Circle", 3);
        hashMap.put("Rectangle", 2);
//        hashMap.put(2,"Hello");
//        hashMap.put(1,"Hi");
////        map.put(1,"Xin chào");
//        hashMap.put(3,"Goodbye");
//        hashMap.put(7,"A");
//        hashMap.put(5,"B");
//        hashMap.put(4,"C");
//        hashMap.put(0,"D");
//        hashMap.put(8,"E");
//        hashMap.put(9,"F");
        for (String key: hashMap.keySet()){
            System.out.println(key + "=" + hashMap.get(key));
        }
        System.out.println(hashMap);
        System.out.println("---------------- LinkedHashMap: giữ nguyên thứ tự key khi thêm vào -----------------");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3,"Goodbye");
        linkedHashMap.put(7,"A");
        linkedHashMap.put(5,"B");
        linkedHashMap.put(4,"C");
        linkedHashMap.put(0,"D");
        linkedHashMap.put(8,"E");
        linkedHashMap.put(9,"F");
        for (Map.Entry<Integer, String> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(linkedHashMap);
        System.out.println("---------------- TreeMap: sắp xếp key tăng dần -----------------");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3,"Goodbye");
        treeMap.put(7,"A");
        treeMap.put(5,"B");
        treeMap.put(4,"C");
        treeMap.put(0,"B");
        treeMap.put(8,"E");
        treeMap.put(9,"F");
        System.out.println(treeMap);
        System.out.println("-----------------Get key from value--------------------");
        Set<Integer> keys = getKeysByValue(treeMap, "B");
        System.out.println(keys);
    }
    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
