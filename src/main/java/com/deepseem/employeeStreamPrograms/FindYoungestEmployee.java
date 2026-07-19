package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindYoungestEmployee {
    public static void main(String[] args) {

        Employee youngestEmployee = EmployeeData.getEmployees()
                .stream()
                .min(Comparator.comparing(Employee::getAge))
                .orElse(null);

        System.out.println(youngestEmployee);
    }
}
