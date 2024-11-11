package com.springframework.dependency_injection.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello I am the service!";
    }
}
