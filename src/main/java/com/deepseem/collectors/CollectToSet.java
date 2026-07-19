package com.deepseem.collectors;

import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args) {

        Set<String> departments =
                EmployeeData.getEmployees()
                        .stream()
                        .map(Employee::getDepartment)
                        .collect(Collectors.toSet());

        System.out.println(departments);
    }

}
