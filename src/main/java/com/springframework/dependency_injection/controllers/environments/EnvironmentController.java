package com.springframework.dependency_injection.controllers.environments;

import com.springframework.dependency_injection.services.environments.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environment;

    public EnvironmentController(@Qualifier("env") EnvironmentService environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment.getEnvironment();
    }
}
