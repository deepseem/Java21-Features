package com.deepseem.employeeStreamPrograms;

import java.util.List;

public class FilterEmployeesByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream()
                .filter(emp -> "IT".equals(emp.getDepartment()))
                .forEach(System.out::println);
    }
}
