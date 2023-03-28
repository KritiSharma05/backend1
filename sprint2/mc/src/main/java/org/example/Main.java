package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext ap= new AnnotationConfigApplicationContext(MConfig.class);
        Movie p=ap.getBean("movie1", Movie.class);
        System.out.println(p);
        Movie p1=ap.getBean("movie2", Movie.class);
        System.out.println(p1);
        Movie p2=ap.getBean("movie3", Movie.class);
        System.out.println(p2);
    }
}
