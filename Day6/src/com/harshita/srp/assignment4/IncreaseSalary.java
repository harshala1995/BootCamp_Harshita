package com.harshita.srp.assignment4;

import com.harshita.srp.assignment2.EmployeeService;

import java.util.List;

import com.harshita.srp.assignment3.Employee;
import com.harshita.srp.assignment2.FinanceService;

/**
 * Created by marwahh on 7/25/2017.
 */
public class IncreaseSalary {
    public static void main(String[] args) {
        List<EmployeeService> list = Employee.createList();
        for (EmployeeService employeeService : list
                ) {
            if (employeeService.getSalary() < 20000) {
                double salary = employeeService.getSalary() + (employeeService.getSalary() * .2);
                employeeService.setSalary(salary);
            }
        }
        for (EmployeeService employeeService : list
                ) {
            System.out.println("Updated salary = " + employeeService.getSalary());
        }
    }
}
