package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by marwahh on 7/22/2017.
 */
public class Test {
    @org.junit.Test
    public void test1() {
        List<Employee> list = new ArrayList<Employee>();
        list = createList();
        Comparator c = new EmployeeComparator();
        list.sort(c);
        for (Employee e: list
             ) {
            System.out.println(e);
        }

    }

    private List<Employee> createList() {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("A", "T", "HR", 1, "Pune"));
        list.add(new Employee("B", "U", "HR", 2, "Pune"));
        list.add(new Employee("C", "V", "HR", 3, "Pune"));
        list.add(new Employee("C", "W", "HR", 4, "Pune"));
        list.add(new Employee("D", "X", "HR", 5, "Pune"));
        list.add(new Employee("E", "Y", "HR", 6, "Pune"));
        list.add(new Employee("F", "Z", "Finance", 7, "Pune"));
        list.add(new Employee("G", "A", "Finance", 8, "Pune"));
        list.add(new Employee("H", "B", "Finance", 9, "Pune"));
        list.add(new Employee("I", "C", "Finance", 10, "Pune"));
        list.add(new Employee("J", "D", "Finance", 11, "Pune"));
        list.add(new Employee("K", "E", "Finance", 12, "Pune"));
        list.add(new Employee("L", "F", "Finance", 13, "Pune"));
        list.add(new Employee("M", "G", "Finance", 14, "Pune"));
        list.add(new Employee("N", "H", "Finance", 15, "Pune"));
        list.add(new Employee("O", "I", "Finance", 16, "Pune"));
        list.add(new Employee("P", "J", "Finance", 17, "Pune"));
        list.add(new Employee("Q", "K", "Finance", 18, "Pune"));
        list.add(new Employee("R", "L", "Finance", 19, "Pune"));
        list.add(new Employee("S", "M", "Finance", 20, "Pune"));


        list.add(new Employee("A", "T", "HR", 21, "Hyderabad"));
        list.add(new Employee("B", "U", "HR", 22, "Hyderabad"));
        list.add(new Employee("C", "V", "HR", 23, "Hyderabad"));
        list.add(new Employee("C", "W", "HR", 24, "Hyderabad"));
        list.add(new Employee("D", "X", "HR", 25, "Hyderabad"));
        list.add(new Employee("E", "Y", "HR", 26, "Hyderabad"));
        list.add(new Employee("F", "Z", "Finance", 27, "Hyderabad"));
        list.add(new Employee("G", "A", "Finance", 28, "Hyderabad"));
        list.add(new Employee("H", "B", "Finance", 29, "Hyderabad"));
        list.add(new Employee("I", "C", "Finance", 30, "Hyderabad"));
        list.add(new Employee("J", "D", "Finance", 31, "Hyderabad"));
        list.add(new Employee("K", "E", "Finance", 32, "Hyderabad"));
        list.add(new Employee("L", "F", "Finance", 33, "Hyderabad"));
        list.add(new Employee("M", "G", "Finance", 34, "Hyderabad"));
        list.add(new Employee("N", "H", "Finance", 35, "Hyderabad"));
        list.add(new Employee("O", "I", "Finance", 36, "Hyderabad"));
        list.add(new Employee("P", "J", "Finance", 37, "Hyderabad"));
        list.add(new Employee("Q", "K", "Finance", 38, "Hyderabad"));
        list.add(new Employee("R", "L", "Finance", 39, "Hyderabad"));
        list.add(new Employee("S", "M", "Finance", 40, "Hyderabad"));
        return list;
    }
}