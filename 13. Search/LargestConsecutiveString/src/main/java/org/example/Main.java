package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
//[Optional] [Bài tập] Tìm chuỗi liên tiếp có độ dài lớn nhất
//Viết chương trình nhắc người dùng nhập chuỗi và hiển thị chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất.
public class Main {
    public static void main(String[] args) {
        String string = "abcabcdgabmnsxy";

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++){
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++){
                if (((int)string.charAt(j) > (int)string.charAt(j - 1)))
                    list.add(string.charAt(j));
                else break;
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character: max){
            System.out.print(character);
        }
        System.out.println();


/*
        for (int i = 0; i < string.length(); i++) { 		//1 Vòng lặp
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); //1 câu lệnh
            }

            list.add(string.charAt(i)); // 1 câu lệnh

            if (list.size() > max.size()) { // 1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }

        // Hiển thị chuỗi liên tiếp dài nhất
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
*/
/* Chuỗi các ký tự liên tiếp liền nhau
        for (int i = 0; i < string.length(); i++){
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++){
                if (((int)string.charAt(j) - (int)string.charAt(j - 1)) == 1)
                    list.add(string.charAt(j));
                else break;
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character: max){
            System.out.print(character);
        }
*/
    }
}