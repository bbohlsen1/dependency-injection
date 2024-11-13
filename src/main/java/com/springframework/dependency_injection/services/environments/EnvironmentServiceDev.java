package com.springframework.dependency_injection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("env")
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "This is Dev";
    }
}
