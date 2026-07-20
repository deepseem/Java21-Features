package com.deepseem.parallelStreams;

import java.util.Comparator;

public class ParallelFindMaxSalary {
    public static void main(String[] args) {

        Employee employee =
                EmployeeData.getEmployees()
                        .parallelStream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .orElse(null);

        System.out.println(employee);
    }
}
