package com.deepseem.collectors;

import java.util.stream.Collectors;

public class FlatMappingExample {
    public static void main(String[] args) {

     /*   var result = EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.flatMapping(
                                employee -> employee.getProjects().stream(),
                                Collectors.toSet()
                        )
                ));

        System.out.println(result);*/

    }
}
