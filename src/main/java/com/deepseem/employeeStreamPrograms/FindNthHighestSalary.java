package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindNthHighestSalary {
    public static void main(String[] args) {

        int n = 3;

        Employee employee =
                EmployeeData.getEmployees()
                        .stream()
                        .sorted(
                                Comparator.comparing(Employee::getSalary)
                                        .reversed())
                        .skip(n - 1)
                        .findFirst()
                        .orElse(null);

        System.out.println(n + " Highest Salary Employee");
        System.out.println(employee);
    }
}
