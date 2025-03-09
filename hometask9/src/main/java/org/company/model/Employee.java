package org.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Employee {

    private String name;
    private String surname;
    private int experience;
    private Post post;

//    public model.Employee(String name, String surname, int workPeriod, model.Post post ) {
//        this.name = name;
//        this.surname = surname;
//        this.workPeriod = workPeriod;
//        this.post = post;
//    }


    @Override
    public  String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workPeriod=" + experience
                ;
    };
}



























