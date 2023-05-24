package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bai17 {
    public static void writeToFile(String str){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Module_2\\20 Bai tap\\_20Baitap\\src\\main\\java\\org\\example\\17.txt",true));
            bw.write(str + "\n");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String str = "";
        for (int i = 2; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                str = i + " x " + j + " = " + i*j;
                writeToFile(str);
            }
        }
    }
}
