package com.harshita.srp.assignment3;

import com.harshita.srp.assignment2.EmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marwahh on 7/25/2017.
 */
public class Employee {
    public static void main(String[] args) {

        List<EmployeeService> list = createList();


        list.size();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("HRA is "+list.get(i).getSalary()*.3);
        }
    }

    public static List createList() {
        List<EmployeeService> list=new ArrayList<EmployeeService>();
        list.add(new EmployeeService(1,"a",50000,"12","ab"));
        list.add(new EmployeeService(2,"b",40000,"12","cd"));
        list.add(new EmployeeService(3,"c",30000,"12","ab"));
        list.add(new EmployeeService(4,"d",20000,"12","ab"));
        list.add(new EmployeeService(5,"e",10000,"12","ef"));
        list.add(new EmployeeService(6,"f",5000,"12","ab"));
        list.add(new EmployeeService(7,"g",9000,"12","gh"));
        list.add(new EmployeeService(8,"h",200000,"12","ab"));
        list.add(new EmployeeService(9,"i",2000,"12","ab"));
        list.add(new EmployeeService(10,"j",20000,"12","ab"));

        return list;
    }

}
