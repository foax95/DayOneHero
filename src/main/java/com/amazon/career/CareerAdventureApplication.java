package com.amazon.career;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CareerAdventureApplication {
    public static void main(String[] args) {
        SpringApplication.run(CareerAdventureApplication.class, args);
    }
}
