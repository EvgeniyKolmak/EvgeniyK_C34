package org.company;

import org.company.model.Employee;
import org.company.model.EmployeeNew;
import org.company.model.Post;
import org.company.service.SalaryService;

public class MainApp {

    public static void main(String[] args) {

        Employee jack = new Employee("Jack", 10, Post.TESTER);
        Employee john = new EmployeeNew("John", 10, Post.TESTER);

        Employee jane = new Employee("Jane", 5, Post.ANALYST);
        Employee july = new EmployeeNew("July", 5, Post.ANALYST);

        SalaryService service = new SalaryService();

        service.printSalary(jack);
        service.printSalary(john);

        service.printSalary(jane);
        service.printSalary(july);

    }

}
