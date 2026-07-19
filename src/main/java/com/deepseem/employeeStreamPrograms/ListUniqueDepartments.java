package com.deepseem.employeeStreamPrograms;

public class ListUniqueDepartments {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
