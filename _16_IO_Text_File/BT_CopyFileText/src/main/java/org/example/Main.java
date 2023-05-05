package org.example;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        File file = new File("D:\\Module_2\\_16_IO_Text_File\\BT_CopyFileText\\src\\main\\java\\org\\example\\baitap.txt");
//
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("BufferedReader được sử dụng để đọc dữ liệu một cách hiệu quả hơn bằng cách đọc theo các buffer.");
//            bufferedWriter.close();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<String> list = readAndWrite.readFile("D:\\Module_2\\_16_IO_Text_File\\BT_CopyFileText\\src\\main\\java\\org\\example\\baitap.txt");
        readAndWrite.writeFile(list, "D:\\Module_2\\_16_IO_Text_File\\BT_CopyFileText\\src\\main\\java\\org\\example\\ketqua.txt");


    }
}