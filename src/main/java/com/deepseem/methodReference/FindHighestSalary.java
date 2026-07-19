package com.deepseem.methodReference;

import java.util.Comparator;

public class FindHighestSalary {
    public static void main(String[] args) {

        Employee employee =
                EmployeeData.getEmployees()
                        .stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .orElse(null);

        System.out.println(employee);
    }
}
