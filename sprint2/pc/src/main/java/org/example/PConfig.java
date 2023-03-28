package org.example;

import org.springframework.context.annotation.Bean;

public class PConfig {
    @Bean("product1")
    public Product getProduct1()
    {
        return new Product(1001,"chapstick" ,"pink");
    }
    @Bean("product2")
    public Product getProduct2()
    {
        return new Product(1002,"eyeshadow" ,"gold");
    }
    @Bean("product3")
    public Product getProduct3()
    {
        return new Product(1003,"liner" ,"black");
    }
}
