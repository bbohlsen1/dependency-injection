package com.springframework.dependency_injection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("env")
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "This is QA";
    }
}
