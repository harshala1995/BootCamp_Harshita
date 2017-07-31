package Employee;

import java.util.Comparator;

/**
 * Created by marwahh on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int v= o1.getLocation().compareTo(o2.getLocation());
        if (v !=0 )
            return v;
        v= o1.getDeptName().compareTo(o2.getDeptName());
        if (v !=0 )
            return v;
        v= o1.getFirstName().compareTo(o2.getFirstName());
        if (v !=0 )
            return v;
        v= o1.getLastName().compareTo(o2.getLastName());
        if (v !=0 )
            return v;
        return (o1.getId()-o2.getId());
    }
}