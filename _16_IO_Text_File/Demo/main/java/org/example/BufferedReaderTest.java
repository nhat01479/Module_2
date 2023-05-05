package org.example;

import java.io.*;
//Sử dụng lớp FileReader thực hiện đọc file text và BufferReader để tăng hiệu quả đọc.
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Module_2\\_16_IO_Text_File\\Demo\\main\\java\\org\\example\\test2.txt");
        BufferedReader br = new BufferedReader(fr);
//        int i;
//        while ((i = br.read()) != -1){
//            System.out.print((char) i);
//        }
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        fr.close();


        String to = "50,Hello,Xinchao";
        String[] r = to.split(",");
        for (String token: r){
            System.out.print(token);
        }
    }
}
