package com.neoteric.map.mapdemo.employee;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList employeeList = new CustomLinkedList();

        // Add employees
        employeeList.add(new Employee(1, "tarun", "HR"));
        employeeList.add(new Employee(2, "arun", "Engineering"));
        employeeList.add(new Employee(3, "vijay", "Marketing"));

        // Display all employees
        employeeList.displayAllEmployees();

        // Find an employee by ID
        int searchId = 2;
        Employee emp = employeeList.findEmployeeById(searchId);
        if (emp != null) {
            System.out.println("\nEmployee with ID " + searchId + ": " + emp);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }
    }
    }

