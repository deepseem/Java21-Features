package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindEmployeeWithLongestName {
    public static void main(String[] args) {

        Employee employee = EmployeeData.getEmployees()
                .stream()
                .max(Comparator.comparing(emp -> emp.getName().length()))
                .orElse(null);

        System.out.println(employee);
    }
}
