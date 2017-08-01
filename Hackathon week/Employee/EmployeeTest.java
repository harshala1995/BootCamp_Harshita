package Employee;

import org.junit.Test;

import java.util.*;

/**
 * Created by marwahh on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = (ArrayList<Employee>) testData();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
//        for (Employee c: arrayList
//             ) {
//            System.out.println(c);
//        }
    }


    public static List<Employee> testData() {
        ArrayList<Employee> arrayList = new ArrayList();
        arrayList.add(new Employee(2, "def", new Date(1995 - 1900, 12, 2), new Date(2017, 1, 1), "abc", "xyz",52));
        arrayList.add(new Employee(1, "abc", new Date(1995 - 1900, 12, 2), new Date(2017, 1, 1), "abc", "xyz",51));
        return arrayList;
    }

    @Test
    public void testSortId() {
        Comparator<Employee> compareids = new IDComparator();
        List<Employee> employees = testData();
        Collections.sort(employees, compareids);
        for (Employee emp : employees
                ) {
            System.out.println(emp);
        }
    }

    interface intExtractor {
        public int extractInt (Employee e);
    }
    class intComparator implements Comparator<Employee> {
        private intExtractor ext;

        public intComparator(intExtractor e) {
            this.ext = ext;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            return ext.extractInt(o1) - ext.extractInt(o2);
        }

    }
    class IDComparator implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            if (o1.getEmpId() > o2.getEmpId())
                return 1;
            else if (o1.getEmpId() < o2.getEmpId())
                return -1;
            return 0;
        }
    }@Test
    public void testSortAge() {
        Comparator<Employee> compareids = new AgeComparator();
        List<Employee> employees = testData();
        Collections.sort(employees, compareids);
        for (Employee emp : employees
                ) {
            System.out.println(emp);
        }
    }

    class AgeComparator implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() > o2.getAge())
                return 1;
            else if (o1.getAge() < o2.getAge())
                return -1;
            return 0;
        }
    }


}