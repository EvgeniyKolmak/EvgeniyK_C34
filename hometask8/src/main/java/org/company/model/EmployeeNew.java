package org.company.model;

public class EmployeeNew extends Employee{

    public EmployeeNew(String name, int workRecord, Post post) {
        super(name, workRecord, post);
    }


    @Override
    public double calculateSalary(double baseSalary) {
        return super.calculateSalary(baseSalary * 1.2);
    }
}
