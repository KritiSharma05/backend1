package org.example;

import org.springframework.context.annotation.Bean;

public class EmpCpnfig {
    @Bean("employee")
    public Employee getEmp()
    {
        Employee emp=new Employee();
        emp.setId(100);
        emp.setEname("Kriti");
        return emp;
    }
    @Bean
    public Department getDept()
    {
        return new Department(1005,"IT");
    }
}
