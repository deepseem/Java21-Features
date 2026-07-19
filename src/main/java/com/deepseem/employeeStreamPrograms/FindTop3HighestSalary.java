package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class FindTop3HighestSalary {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
