package Person;

/**
 * Created by marwahh on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1= new Person("Ramesh", "M");
        Person p2= new Person("Ramesh", "M");
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p1.getName().hashCode()==p2.getName().hashCode());

        //System.out.println(p1.equals(null));
//        for (int i = 0; i < 200; i++) {
//
//            System.out.println("i= "+ i + " " + (Integer.valueOf(i) == Integer.valueOf(i)));
//        }
    }
}
