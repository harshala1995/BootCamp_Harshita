package com.harshita.srp.assignment2;

public class HRService {
    private final EmployeeService employeeService;

    public HRService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void eligibleForPromotion(boolean status) {
        if (status == true)
            System.out.println("Eligible for Promotion");
        else
            System.out.println("Not eligible for Promotion");
    }

    public void changeProject(String project) {
        System.out.println("New project is : " + project);
    }

    public void changeDesignation(String desig) {
        employeeService.setDesig(desig);
    }
}