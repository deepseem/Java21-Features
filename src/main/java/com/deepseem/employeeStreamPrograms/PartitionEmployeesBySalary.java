package com.deepseem.employeeStreamPrograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesBySalary {
    public static void main(String[] args) {

        Map<Boolean, List<Employee>> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.partitioningBy(
                                employee -> employee.getSalary() > 70000
                        ));

        result.forEach((key, employees) -> {
            System.out.println(key ? "Salary > 70000" : "Salary <= 70000");
            employees.forEach(System.out::println);
            System.out.println();
        });
    }
}
