package com.example.datadevprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataDevProdApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataDevProdApplication.class, args);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        productRepository.findAll().forEach(System.out::println);
    }



}
