package com.neoteric.map.mapdemo.employee;

public class CustomHashmapTest {
    public static void main(String[] args) throws InterruptedException {
        CustomEmployeeHashMap employeeMap = new CustomEmployeeHashMap();

        // Add some employees to the map
        employeeMap.put(101, new Employee(2300, "Developer"));
        employeeMap.put(102, new Employee(2400, "Manager"));
        employeeMap.put(103, new Employee("Alice Johnson", "Designer"));

        // If there are no employees in the system
        if (employeeMap.size() == 0) {
            System.out.println("No employees in the system.");
        } else {
            // Display all employees (filtered for Managers)
            System.out.println("Displaying all employees who are Managers:");
            employeeMap.displayAllEmployees();
        }
    }
    }

