package com.neoteric.map.mapdemo.department;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepartmentTest {
    public static void main(String[] args) {
        Department dept1 = new Department("IT");
        dept1.addEmployee(new Employee("vijay", 75000));
        dept1.addEmployee(new Employee("rahul", 50000));

        Department dept2 = new Department("HR");
        dept2.addEmployee(new Employee("rakesh", 45000));
        dept2.addEmployee(new Employee("sateesh", 60000));

        Department dept3 = new Department("Finance");
        dept3.addEmployee(new Employee("gopi", 90000));
        dept3.addEmployee(new Employee("uday", 55000));

        List<Department> departments = Arrays.asList(dept1, dept2, dept3);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .max(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(maxEmployee -> System.out.println("Company Maximum Salary: " + maxEmployee));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .min(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(minEmployee -> System.out.println("Company Minimum Salary: " + minEmployee));

        for (Department department : departments) {
            department.getEmployees().stream()
                    .max(Comparator.comparingDouble(Employee::getSalary))
                    .ifPresent(maxEmployee -> System.out.println("Department: " + department.getName() + " Maximum Salary: " + maxEmployee));

            department.getEmployees().stream()
                    .min(Comparator.comparingDouble(Employee::getSalary))
                    .ifPresent(minEmployee -> System.out.println("Department: " + department.getName() + " Minimum Salary: " + minEmployee));
        }
    }
}


