package org.company.service;

import org.company.model.Director;
import org.company.model.Employee;

public class EmployeeService {

    public boolean hasSubordinate(Director director, String name) {
        if (director.getName().equals(name) || director.getSurname().equals(name)) {
            return true;
        }

        for (Employee employee : director.getSubordinates()) {
            if (employee instanceof Director) {
                if (hasSubordinate((Director) employee, name)) {
                    return true;
                }
            } else {
                if (employee.getName().equals(name) || employee.getSurname().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

}