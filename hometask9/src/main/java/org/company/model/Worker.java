package org.company.model;

import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String name, String surname, int workPeriod, Post post) {
        super(name, surname, workPeriod, post);
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                '}';
    }
}
