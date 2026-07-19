package com.deepseem.collectors;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {

        Map<Integer,String> map =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.toMap(
                                Employee::getId,
                                Employee::getName));

        System.out.println(map);
    }
}
