package com.kolmak;

import com.kolmak.domain.Employee;
import com.kolmak.domain.Profession;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(Profession.DOCTOR, 50000.0),
                new Employee(Profession.ENGINEER, 60000),
                new Employee(Profession.TEACHER, 40000),
                new Employee(Profession.DOCTOR, 55000),
                new Employee(Profession.ENGINEER, 62000),
                new Employee(Profession.ARTIST, 30000)
        );

        Map<Profession, Double> resul1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getPost, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(resul1);

        Map<Profession, Long> result2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getPost, Collectors.counting()));

        System.out.println(result2);

        Map<Profession, Double> result3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getPost, Collectors.summingDouble(Employee::getSalary)));

        System.out.println(result3);

    }
}

// Есть список сотрудников компании. Каждый сотрудник обладает следующими полями (профессия - enum, величина зп).
// При помощи стрима и методов группировки необходимо узнать
//
//1) Среднюю зп по профессиям
//
//2) Сколько работников относится к каждой из профессий
//
//3) Сколько компания тратит денег на зп каждой профессии