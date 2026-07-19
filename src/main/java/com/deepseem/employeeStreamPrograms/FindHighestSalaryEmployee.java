package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindHighestSalaryEmployee {
    public static void main(String[] args) {

        Employee employee = EmployeeData.getEmployees()
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        System.out.println(employee);
    }
}
