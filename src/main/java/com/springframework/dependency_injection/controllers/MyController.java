package com.springframework.dependency_injection.controllers;

import com.springframework.dependency_injection.services.GreetingService;
import com.springframework.dependency_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {

        System.out.println("I am the controller");
        return greetingService.sayGreeting();
    }

}
