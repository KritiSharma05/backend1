package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int id;
    private String ename;
    private Department department;
    @Autowired
    public Employee(Department department)
    {
        this.department=department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", department=" + department +
                '}';
    }
}
