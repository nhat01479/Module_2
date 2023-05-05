package org.example;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Module_2\\_16_IO_Text_File\\TH_TimMax\\src\\main\\java\\org\\example\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Module_2\\_16_IO_Text_File\\TH_TimMax\\src\\main\\java\\org\\example\\maxValue.txt", maxValue);
    }
    public static  int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
