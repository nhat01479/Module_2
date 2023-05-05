package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*

        System.out.println("---------------Lớp File-----------------------");
        File text = new File("D:\\test\\test.txt");
        System.out.println("File có tồn tại không?" + text.exists());
        System.out.println("Tên file"  + text.getName());
        System.out.println("Đường dẫn thư mục: " + text.getParent());
        System.out.println("Đường dẫn thư mục đầy đủ: " + text.getPath());
        System.out.println("---------------Tạo thư mục-----------------------");
        File dir = new File("D:\\test\\test");
        if (!dir.exists())
            dir.mkdir();


        System.out.println("---------------Lớp Formatter-----------------------");
        try {
            System.out.println("Tạo file");
            Formatter file = new Formatter("D:\\test\\test1.txt");
            file.format("%s", "Xin chào!");
            file.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
 */

        //Tạo thư mục
        File d = new File("D:\\test\\test");
        if (!d.exists())
            d.mkdir();

        //Tạo mới và viết nội dung vào file
        try {
            Formatter f = new Formatter("D:\\Module_2\\_16_IO_Text_File\\Demo\\main\\java\\org\\example\\test.txt");
            f.format("Test file\r\n");
            f.format("%s %s", "1", "Xin chào\n");
            f.format("%s %s", "2", "Hello!");
            f.close();
        } catch (FileNotFoundException e){
            System.out.println("Error1");
        }

        //Đọc nội dung file: Lớp Scanner
        try {
            File file = new File("D:\\Module_2\\_16_IO_Text_File\\Demo\\main\\java\\org\\example\\test.txt");
            System.out.println(file.getAbsolutePath());
            Scanner sc = new Scanner(file);
            String content = "";
            while (sc.hasNext()){
                content += sc.next() + "\r\n";
            }
            System.out.println(content);
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Error2");
        }

    }
}