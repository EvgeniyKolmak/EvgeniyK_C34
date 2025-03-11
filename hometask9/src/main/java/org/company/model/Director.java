package org.company.model;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Director extends Employee {

    private Employee[] subordinates;

    public Director(String name, String surname, int workPeriod) {
        super(name, surname, workPeriod);
        this.setPost(Post.DIRECTOR);
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
            System.out.println("Employee is null");
        }

    }

    @Override
        public String toString() {
        return "Director {" +
                    super.toString() +
                    " Subordinates: " + Arrays.toString(subordinates) +
                    '}';
    }

}