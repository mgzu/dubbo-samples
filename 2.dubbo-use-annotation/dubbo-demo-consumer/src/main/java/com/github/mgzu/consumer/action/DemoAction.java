package com.github.mgzu.consumer.action;

import com.github.mgzu.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class DemoAction {

    @Reference(version = "0.1")
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }
}
