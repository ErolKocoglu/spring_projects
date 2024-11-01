package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Entity {

    private final String name;

    public void greet() {
        System.out.println("Hello from " + name);
    }

    @Autowired
    public Entity(@Qualifier("name2") String name) {
        System.out.println("This constructor run");
        this.name = name;
    }
}
