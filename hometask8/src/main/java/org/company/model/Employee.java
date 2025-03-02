package org.company.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String name;
    private int workRecord;
    private Post post;

    public Employee(String name, int workRecord, Post post) {
        this.name = name;
        this.workRecord = workRecord;
        this.post = post;
    }

    public double calculateSalary(double baseSalary) {
        double yearPercent = 0.1;
        double  bonus = baseSalary * yearPercent * workRecord;
        return baseSalary + bonus;
    }

}
