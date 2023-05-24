package org.example;

public class Main {
    public static void main(String[] args) {

        String x = "51-X2-123.04";
        String y = "5\\d-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }    }
}