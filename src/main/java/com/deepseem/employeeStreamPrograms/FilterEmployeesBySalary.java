package com.deepseem.employeeStreamPrograms;

import java.util.List;

public class FilterEmployeesBySalary {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .forEach(System.out::println);
    }
}
