package com.deepseem.collectors;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class SummarizingSalary {
    public static void main(String[] args) {

        DoubleSummaryStatistics statistics =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.summarizingDouble(
                                Employee::getSalary));
        System.out.println(statistics);
    }
}
