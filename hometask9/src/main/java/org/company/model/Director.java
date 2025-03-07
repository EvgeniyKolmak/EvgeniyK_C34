package org.company.model;

import lombok.Getter;

@Getter
public class Director extends Employee {

    private Employee[] subordinates;


    public Director(String name, String surname, int workPeriod, Post post) {
        super(name, surname, workPeriod, post);
        this.subordinates = new Employee[0];
    }

    public void add(Employee employee) {
        if (employee != null) {
            Employee[] newEmployees = new Employee[subordinates.length + 1];
            System.arraycopy(subordinates, 0, newEmployees, 0, subordinates.length);
            newEmployees[newEmployees.length - 1] = employee;
            subordinates = newEmployees;
        }
        else {
            System.out.println("model.Employee is null");
        }

    }

    public void hasSubordinate(String name) {

    }

    @Override
    public String toString() {
        String data = "Director {" +
                super.toString() +
                '}';

        if(subordinates.length > 0) {
            data += "\n\t" + "Subordinates: ";
            for (Employee employee : subordinates) {
                data +=  "\n\t\t" + employee.toString();
            }
        }

        return data;
    }

}























