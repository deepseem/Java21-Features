package com.deepseem.streamAPI;

import com.deepseem.lambdaExpressions.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Integer> salaries =
                Arrays.asList(30000,50000,80000,90000,70000);

        Integer secondHighest = salaries.stream()
                .distinct()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest);

        //Group Employees by Department
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 70000, "IT"),
                new Employee(102, "Alex", 90000, "HR"),
                new Employee(103, "Bob", 50000, "IT"),
                new Employee(104, "David", 80000,"HR")
        );
        Map<String,List<Employee>> map =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        map.entrySet().forEach(System.out::println);
        //. Count Employees by Department

        Map<String,Long> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()));
        result.entrySet().forEach(System.out::println);

        //Highest Salary Employee
        Employee emp = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println(emp);

        //Sort Employees by Salary
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        //Descending
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        //Top 3 Highest Salaries
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

    }



}
