package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\Module_2\\_16_IO_Text_File\\BT_DocFile\\src\\main\\java\\org\\example\\baitap.csv";
        BufferedReader br = null;
        try {
            br  = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<Country> countries = null;
        try {
            countries = getListCountryFromFile(br);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Country country : countries) {
            System.out.println(country);
        }


    }

    public static List<Country> getListCountryFromFile(BufferedReader br) throws IOException {

        List<Country> countries = new ArrayList<>();

        String string;
        while ((string = br.readLine()) != null) {
            String[] str = string.split(",");
            System.out.println(Arrays.toString(str));
            countries.add(new Country(Integer.parseInt(str[0]), str[1], str[2]));
        }
        return countries;
    }


}