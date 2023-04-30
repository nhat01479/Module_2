package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        System.out.println("--------------HashMap----------------");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entry in HashMap");
        System.out.println(hashMap);
        for (String key: hashMap.keySet()){
            System.out.println("Key: " + key + " - Value: " + hashMap.get(key));
        }
        System.out.println("---------------TreeMap: lưu key theo thứ tự giảm dần---------------");
        System.out.println("Display entries in ascending order of key");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        for (String key: treeMap.keySet()){
            System.out.println("Key: " + key + " - Value: " + treeMap.get(key));
        }

        System.out.println("---------------LinkedHashMap---------------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
