package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindLowestSalaryEmployee {
    public static void main(String[] args) {

        Employee employee = EmployeeData.getEmployees()
                .stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        System.out.println(employee);
    }
}
