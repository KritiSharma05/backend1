package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext ap= new AnnotationConfigApplicationContext(EmpCpnfig.class);
        Employee e=ap.getBean("employee", Employee.class);
        System.out.println(e);
    }
}
