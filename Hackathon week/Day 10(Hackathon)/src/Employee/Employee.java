package Employee;

/**
 * Created by marwahh on 7/22/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String deptName;
    private int id;
    private String location;

    public Employee(String firstName, String lastName, String deptName, int id, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptName = deptName;
        this.id = id;
        this.location = location;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
