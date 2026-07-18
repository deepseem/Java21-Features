package com.deepseem.lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class EmployeeFilter {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 70000, "IT"),
                new Employee(102, "Alex", 90000, "HR"),
                new Employee(103, "Bob", 50000, "IT"),
                new Employee(104, "David", 80000, "HR")
        );

        //Filtering Employees Using Lambda
        employees.stream()
                .filter(emp -> emp.getSalary() > 70000)
                .forEach(System.out::println);

        //Employee Name Starts With 'A'
        employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .forEach(System.out::println);

        //Employee ID Greater Than 102
        employees.stream()
                .filter(emp -> emp.getId() > 102)
                .forEach(System.out::println);

        //Salary Between 60k and 90k
        employees.stream()
                .filter(emp -> emp.getSalary() >= 60000 &&
                        emp.getSalary() <= 90000)
                .forEach(System.out::println);
    }
}
