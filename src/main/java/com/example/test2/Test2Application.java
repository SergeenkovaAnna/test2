package com.example.test2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class Test2Application {

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
    }

}
