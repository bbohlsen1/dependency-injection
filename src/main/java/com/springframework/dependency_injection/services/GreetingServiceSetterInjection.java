package com.springframework.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello I am setting a greeting";
    }
}
