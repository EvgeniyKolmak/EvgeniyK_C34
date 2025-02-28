package org.company.model;

public enum Post {

    TESTER(2000),
    ANALYST(4000);

    private final double baseSalary;

    Post(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

}
