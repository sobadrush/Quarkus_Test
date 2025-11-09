package com.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String getHelloMessage() {
        return "Hello World!";
    }

    public String getGreetingMessage() {
        return "Greeting!";
    }

    public String getGreetingMessage(String name) {
        return "Hello, " + name + "!";
    }
    
}

