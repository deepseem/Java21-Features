package com.deepseem.employeeStreamPrograms;

public class FindAverageAge {
    public static void main(String[] args) {

        Double averageAge =
                EmployeeData.getEmployees()
                        .stream()
                        .mapToInt(Employee::getAge)
                        .average()
                        .orElse(0);

        System.out.println("Average Age : " + averageAge);
    }
}
