package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext ap= new AnnotationConfigApplicationContext(PConfig.class);
        Product p=ap.getBean("product1", Product.class);
        System.out.println(p);
        Product p1=ap.getBean("product2", Product.class);
        System.out.println(p1);
        Product p2=ap.getBean("product3", Product.class);
        System.out.println(p2);
    }
}
