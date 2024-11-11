package com.springframework.dependency_injection.services;

import com.springframework.dependency_injection.controllers.ConstructorInjectedController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary  implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary bean!!!!!!!!";
    }
}
