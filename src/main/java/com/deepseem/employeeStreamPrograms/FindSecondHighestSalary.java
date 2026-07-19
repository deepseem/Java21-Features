package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindSecondHighestSalary {
    public static void main(String[] args) {

        Employee employee = EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(employee);
    }
}
