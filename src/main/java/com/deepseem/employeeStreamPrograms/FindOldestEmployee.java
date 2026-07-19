package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindOldestEmployee {
    public static void main(String[] args) {

        Employee oldestEmployee = EmployeeData.getEmployees()
                .stream()
                .max(Comparator.comparing(Employee::getAge))
                .orElse(null);

        System.out.println(oldestEmployee);
    }
}
