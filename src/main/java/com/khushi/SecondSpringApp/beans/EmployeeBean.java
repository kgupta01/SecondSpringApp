package com.khushi.SecondSpringApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Khushi Gupta";
    private int id = 2115000532;

    @Autowired
    private DepartmentBean department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentName() {
        return department.getDeptName();
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", " + department;
    }
}