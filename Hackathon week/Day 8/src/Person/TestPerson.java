package Person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marwahh on 7/20/2017.
 */
public class TestPerson {
    @Test
    public void test1() {
        ArrayList<Person> list = (ArrayList<Person>) createPersonList();
        for (Person p:list
             ) {
            System.out.println(p);
        }
    }@Test
    public void test2() {
        CountPerson.count((ArrayList<Person>) createPersonList());
    }

    List<Person> createPersonList() {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Suresh","M"));
        list.add(new Person("Ramesh","M"));
        list.add(new Person("Geeta","F"));
        list.add(new Person("Suresh","M"));
        list.add(new Person("Suresh","M"));
        return list;
    }
}