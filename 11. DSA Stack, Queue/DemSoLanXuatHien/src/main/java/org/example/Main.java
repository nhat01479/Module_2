package org.example;
//[Bài tập] Đếm số lần xuất hiện của mỗi từ trong một chuỗi sử dụng Map
//https://viettuts.vn/bai-tap-java/liet-ke-so-lan-xuat-hien-cua-cac-tu-trong-mot-chuoi
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "abcabad";
        Map<String, Integer> treemap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i)).toUpperCase();
                if (treemap.containsKey(key)){
                    treemap.put(key, treemap.get(key) + 1);;
                } else treemap.put(key, 1);
        }
        System.out.println(treemap);
    }
}
