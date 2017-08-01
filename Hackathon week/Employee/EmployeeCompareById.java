package Employee;

/**
 * Created by marwahh on 7/19/2017.
 */
class EmployeeCompareById implements compare {
    public int compare(Object o1,Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        if(e1.getEmpId()>e2.getEmpId())
            return 1;
        else if(e1.getEmpId()<e2.getEmpId())
            return -1;
        return 0;
    }
}
