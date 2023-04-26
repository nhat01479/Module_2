package mylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> listt = new ArrayList<>();
        listt.add(1);
        listt.add(2);
        listt.add(3);
        listt.add(3);
        System.out.println(listt);
        for (Integer x:listt){
            System.out.println(x);
        }
        ArrayList<Integer> l = (ArrayList<Integer>) listt.clone();
        System.out.println(l);
    }

}
