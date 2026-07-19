package com.deepseem.optional;

import java.util.Optional;

public class FindEmployeeById {

        public static Optional<Employee> findEmployee(int id) {

            if (id == 101)
                return Optional.of(
                        new Employee(101, "John", 80000.0));

            return Optional.empty();
        }

        public static void main(String[] args) {

            Employee employee =
                    findEmployee(101)
                            .orElse(new Employee(0, "Unknown", 0.0));

            System.out.println(employee);
        }
}
