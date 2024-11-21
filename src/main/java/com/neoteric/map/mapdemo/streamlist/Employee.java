package com.neoteric.map.mapdemo.streamlist;

public class Employee {
    private String empid;
    private String dept;

    public Employee(String empid, String dept) {
        this.empid = empid;
        this.dept = dept;
    }

    public String getEmpid() {
        return empid;
    }

    public String getDept() {
        return dept;
    }
}
