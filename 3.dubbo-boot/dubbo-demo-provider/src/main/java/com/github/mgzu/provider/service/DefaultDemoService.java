package com.github.mgzu.provider.service;

import com.github.mgzu.api.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.1")
public class DefaultDemoService implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}