package com.deepseem.employeeStreamPrograms;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;
    private LocalDate joiningDate;

    public Employee(int id, String name, String department,
                    double salary, int age,
                    String gender, LocalDate joiningDate) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.joiningDate = joiningDate;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getDepartment() { return department; }

    public double getSalary() { return salary; }

    public int getAge() { return age; }

    public String getGender() { return gender; }

    public LocalDate getJoiningDate() { return joiningDate; }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
