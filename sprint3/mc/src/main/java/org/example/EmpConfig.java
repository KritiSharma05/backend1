package org.example;

import org.springframework.context.annotation.Bean;

public class EmpConfig {
    @Bean("employee")
    public Employee getEmp()
    {
        Employee emp=new Employee(getDepartment());
        emp.setId(101);
        emp.setEname("Cheerag");
        return emp;
    }
    @Bean
    public Department getDepartment()
    {
        return new Department(1002,"Management");
    }

}
