package com.deepseem.employeeStreamPrograms;

import java.util.Comparator;

public class SortDepartmentThenSalary {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .sorted(
                        Comparator.comparing(Employee::getDepartment)
                                .thenComparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
