package com.harshita.srp.assignment2;

public class FinanceService {
    private final EmployeeService employeeService;

    public FinanceService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private void updateSalary(double salary) {
        employeeService.setSalary(salary);
    }

    public double calculateTDS(double salary) {
        return (.2 * employeeService.getSalary());
    }
}