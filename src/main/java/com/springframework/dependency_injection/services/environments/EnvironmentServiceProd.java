package com.springframework.dependency_injection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("env")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "This is Prod";
    }
}
