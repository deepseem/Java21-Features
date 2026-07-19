package com.deepseem.defaultMethods;

import java.util.Arrays;

public class DefaultMethodWithStreams {
    public static void main(String[] args) {

        EmployeeService service =
                new EmployeeService(){};

        service.printEmployees(
                Arrays.asList("John","David","Alice"));
    }
}
