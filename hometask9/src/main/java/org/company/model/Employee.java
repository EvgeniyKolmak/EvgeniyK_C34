package org.company.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Employee {

    private String name;
    private String surname;
    private int experience;
    private Post post;

    public Employee(String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }


    @Override
    public  String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workPeriod=" + experience
                ;
    };
}