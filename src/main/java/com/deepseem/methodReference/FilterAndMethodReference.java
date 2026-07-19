package com.deepseem.methodReference;

public class FilterAndMethodReference {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .filter(employee -> employee.getSalary() > 80000)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
