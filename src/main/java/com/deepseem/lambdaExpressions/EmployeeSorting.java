package com.deepseem.lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 70000),
                new Employee(102, "Alex", 90000),
                new Employee(103, "Bob", 50000),
                new Employee(104, "David", 80000)
        );

        //Sort by Salary Ascending
        employees.sort((e1, e2) ->
                Double.compare(e1.getSalary(), e2.getSalary()));
        employees.forEach(System.out::println);
        //Sort by Salary Descending
        employees.sort((e1, e2) ->
                Double.compare(e2.getSalary(), e1.getSalary()));
        employees.forEach(System.out::println);
        //Sort by Name
        employees.sort((e1, e2) ->
                e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        //Sort by Id
        employees.sort((e1, e2) ->
                Integer.compare(e1.getId(), e2.getId()));
        employees.forEach(System.out::println);
    }
}
