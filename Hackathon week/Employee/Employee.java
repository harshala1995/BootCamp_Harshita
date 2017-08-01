package Employee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by marwahh on 7/18/2017.
 */
public class Employee {


    private int empId;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private Date dateOfJoining;
    private String deptId;
    private String location;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public Employee(int empId, String name, Date dateOfBirth, Date dateOfJoining, String deptId, String location, int age) {
        this.empId = empId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.deptId = deptId;
        this.location = location;
        this.age = age;
    }

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public String getDeptId() {
        return deptId;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfJoining=" + dateOfJoining +
                ", deptId='" + deptId + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}
