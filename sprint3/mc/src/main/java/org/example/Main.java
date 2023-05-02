package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(EmpConfig.class);
        Employee e = ctx.getBean("employee", Employee.class);
        System.out.println(e);

    }
}
