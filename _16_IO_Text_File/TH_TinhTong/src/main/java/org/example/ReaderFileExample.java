package org.example;

import java.io.*;
import java.util.Scanner;

public class ReaderFileExample {
    public static void main(String[] args){
        try {
            FileWriter file = new FileWriter("D:\\Module_2\\_16_IO_Text_File\\TH_TinhTong\\src\\main\\java\\org\\example\\thuchanh1.txt");
            file.write("1\n");
            file.write("2\n");
            file.write("3\n");
            file.write("3\n");
//            file.write("a\n");
            file.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Nhập đường dẫn");
        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
        String path = "D:\\Module_2\\_16_IO_Text_File\\TH_TinhTong\\src\\main\\java\\org\\example\\thuchanh1.txt";
        ReaderFileExample readerFileExample = new ReaderFileExample();
        readerFileExample.readFileText(path);
    }
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new NullPointerException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
//            fr.close();
            System.out.println("SUM = " + sum);
        } catch (Exception e){
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }
}