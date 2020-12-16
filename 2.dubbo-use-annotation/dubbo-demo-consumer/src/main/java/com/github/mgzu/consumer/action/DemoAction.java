package com.github.mgzu.consumer.action;

import com.github.mgzu.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class DemoAction {

    @DubboReference(version = "0.1")
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }
}
