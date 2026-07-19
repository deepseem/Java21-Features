package com.deepseem.forEach;

import java.util.Comparator;

public class ForEachSortEmployees {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
