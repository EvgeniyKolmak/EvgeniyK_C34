package org.company.model;

public class Worker extends Employee {
    public Worker(String name, String surname, int workPeriod) {
        super(name, surname, workPeriod);
        setPost(Post.WORKER);
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                '}';
    }
}