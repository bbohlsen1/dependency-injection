package com.springframework.dependency_injection.controllers;

import com.springframework.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    //property
    private GreetingService greetingService;

    //Using Autowire on the setter utilizes it correctly.
    //You cannot use Autowire on the property and expect the setter to work.
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
