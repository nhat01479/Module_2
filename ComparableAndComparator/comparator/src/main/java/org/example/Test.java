package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Nhàn",22));
        people.add(new Person("Nhân",22));
        people.add(new Person("Thư",20));
        people.add(new Person("Anh",21));
        people.add(new Person("Tiến",21));
        people.add(new Person("Trang",21));
        people.add(new Person("Ngọc",21));
        ArrayList<Person> list = new ArrayList<>(people);
        System.out.println("list student");
        for (Person student: people) {
            System.out.println(student.toString());
        }

        /* Dùng Comparator như 1 anonymous class: khai báo và khởi tạo đối tượng cùng 1 lúc)
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        */



        ComparatorTest comparatorTest = new ComparatorTest();
        Collections.sort(people, comparatorTest);



        System.out.println("After-sort");
        for (Person student: people) {
            System.out.println(student.toString());
        }


    }
}
class ComparatorTest implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - (o2.getAge());
    }
}