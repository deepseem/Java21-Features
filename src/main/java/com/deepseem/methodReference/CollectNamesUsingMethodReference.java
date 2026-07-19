package com.deepseem.methodReference;

import java.util.List;
import java.util.stream.Collectors;

public class CollectNamesUsingMethodReference {
    public static void main(String[] args) {

        List<String> names =
                EmployeeData.getEmployees()
                        .stream()
                        .map(Employee::getName)
                        .collect(Collectors.toList());

        System.out.println(names);
    }
}
