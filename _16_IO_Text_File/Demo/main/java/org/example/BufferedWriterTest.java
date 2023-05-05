package org.example;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter wr = new FileWriter("D:\\Module_2\\_16_IO_Text_File\\Demo\\main\\java\\org\\example\\test2.txt");
        BufferedWriter br = new BufferedWriter(wr);
        br.write("Welcome to Java\n");
        br.write("Xin chào");
        br.close();
        wr.close();
        System.out.println("Success...");
    }
}
