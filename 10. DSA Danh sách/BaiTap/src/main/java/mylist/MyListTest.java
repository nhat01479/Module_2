package mylist;



public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size);
        list.add(1,5);
        System.out.println(list.size);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf(5));

    }
}
