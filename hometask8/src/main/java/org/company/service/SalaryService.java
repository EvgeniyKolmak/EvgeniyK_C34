package org.company.service;

import org.company.model.Employee;

public class SalaryService {

    public void printSalary(Employee employee) {
        System.out.printf("Зарплата работника %s: %.2f %n", employee.getName(), employee.calculateSalary(employee.getPost().getBaseSalary()));
    }

}
