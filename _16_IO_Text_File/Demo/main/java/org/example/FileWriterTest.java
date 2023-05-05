package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("D:\\Module_2\\_16_IO_Text_File\\Demo\\main\\java\\org\\example\\test1.txt");
            fw.write("Hello World!");
            fw.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Success....");


        String str = "File Handling in Java using "+

                " FileWriter and FileReader";


        FileWriter fw=new FileWriter("output.txt");

        System.out.println("aslo");
//
        for (int i = 0; i < str.length(); i++)

            fw.write(str.charAt(i));

        System.out.println("Writing successful");


        fw.close();
    }
}
