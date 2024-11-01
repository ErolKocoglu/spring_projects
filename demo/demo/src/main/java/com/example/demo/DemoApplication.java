package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DemoApplication.class, args);
        Entity entity = context.getBean(Entity.class);
        entity.greet();

    }


    @Bean
    public String name1() {
        return "asd";
    }

    @Bean
    public String name2() {
        return "qwe";
    }

}
