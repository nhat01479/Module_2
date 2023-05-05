package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung không đúng");
        }
        return list;
    }
    public void writeFile(List<String> list, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath, true); //apped true để mỗi khi chạy lại sẽ ghi tiếp file
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i<list.size(); i++){
                bufferedWriter.write(list.get(i));
            }
            bufferedWriter.write("\nSố lượng ký tự trong tệp: " + (list.size() + 1));
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
