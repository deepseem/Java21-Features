package com.deepseem.employeeStreamPrograms;

public class FindEmployeesByGender {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .filter(employee ->
                        "Female".equalsIgnoreCase(employee.getGender()))
                .forEach(System.out::println);
    }
}
