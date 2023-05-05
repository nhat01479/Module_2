package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Module_2\\_16_IO_Text_File\\Demo\\main\\java\\org\\example\\test.txt");
        int i;
        while ((i = fr.read()) != -1){
            System.out.print((char) i);
        }
        fr.close();
    }
}
