package assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by marwahh on 7/27/2017.
 */
public class ProcessEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        createData(employees);
        TreeSet<Employee> sortedSalary = new TreeSet<>();

        for (Employee e : employees
                ) {
            if (e.getSalary() > 40000)
                sortedSalary.add(e);
        }
        System.out.println(sortedSalary.size());
        Iterator<Employee> iter = sortedSalary.iterator();

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\marwahh\\IdeaProjects\\Assignments\\Day 8 Assignments\\src\\Data.txt");
            oos = new ObjectOutputStream(fos);
            int count = 0;
            while (iter.hasNext()) {
                oos.writeObject(iter.next());
                count++;
            }
            System.out.println(count);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:\\Users\\marwahh\\IdeaProjects\\Assignments\\Day 8 Assignments\\src\\Data.txt");
            ois = new ObjectInputStream(fis);
            Employee e = (Employee) ois.readObject();
            while (e != null) {
                System.out.println(e);
                e = (Employee) ois.readObject();
            }
        } catch (EOFException e) {
            System.out.println("done");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void createData(List<Employee> employees) {
        employees.add(new Employee(1, "a", 50000, "12", "ab"));
        employees.add(new Employee(2, "b", 40000, "12", "cd"));
        employees.add(new Employee(3, "c", 30000, "12", "ef"));
        employees.add(new Employee(4, "d", 20000, "12", "gh"));
        employees.add(new Employee(5, "e", 60000, "12", "ij"));
        employees.add(new Employee(6, "f", 500000, "12", "kl"));
        employees.add(new Employee(7, "g", 9000, "12", "mn"));
        employees.add(new Employee(8, "h", 200000, "12", "op"));
        employees.add(new Employee(9, "i", 2000, "12", "qr"));
        employees.add(new Employee(10, "j", 200900, "12", "st"));

    }
}
