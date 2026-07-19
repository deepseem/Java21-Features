package com.deepseem.employeeStreamPrograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {

        Map<String, List<Employee>> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        result.forEach((department, employees) -> {
            System.out.println(department);
            employees.forEach(System.out::println);
            System.out.println();
        });
    }
}
