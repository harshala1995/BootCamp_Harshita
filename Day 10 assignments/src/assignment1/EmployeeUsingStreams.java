package assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * Created by marwahh on 7/29/2017.
 */
public class EmployeeUsingStreams {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee(1, "a", 50000, "12", "ab"),
                new Employee(2, "b", 40000, "12", "cd"),
                new Employee(3, "c", 30000, "12", "ef"),
                new Employee(4, "d", 20000, "12", "gh"),
                new Employee(5, "e", 60000, "12", "ij"),
                new Employee(6, "f", 500000, "12", "kl"),
                new Employee(7, "g", 9000, "12", "mn"),
                new Employee(8, "h", 200000, "12", "op"),
                new Employee(9, "i", 2000, "12", "qr"),
                new Employee(10, "j", 200900, "12", "st"));

        double sum = list.stream().filter((e) -> e.getSalary() > 50000).map((e) -> .1 * e.getSalary()).reduce((a, b) -> a + b).get();
        System.out.println(sum);

        double count = list.stream().map((e) -> 1).reduce((a, b) -> {
            return a = a + 1;
        }).get();
        System.out.println(count);

        System.out.println(sum / count);

        Optional min = list.stream().min((e,d)->{return (int)(d.getSalary()-e.getSalary());});
        System.out.println(min);

        Optional max = list.stream().max((e,d)->{return (int)(e.getSalary()-d.getSalary());});
        System.out.println(min);


    }
}
