package com.springframework.dependency_injection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("env")
public class EnvironmentServiceUAT implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "This is UAT";
    }
}
