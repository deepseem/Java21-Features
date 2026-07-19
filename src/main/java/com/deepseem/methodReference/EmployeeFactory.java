package com.deepseem.methodReference;

public interface EmployeeFactory {
    Employee create(int id,
                    String name,
                    String department,
                    double salary);
}
