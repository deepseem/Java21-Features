package com.deepseem.employeeStreamPrograms;

public class FindEmployeesOlderThan30 {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .filter(employee -> employee.getAge() > 30)
                .forEach(System.out::println);
    }
}
