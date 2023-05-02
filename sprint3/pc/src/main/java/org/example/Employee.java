package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int id;
    private String ename;
    @Autowired
    private Department department;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", department=" + department +
                '}';
    }
}
