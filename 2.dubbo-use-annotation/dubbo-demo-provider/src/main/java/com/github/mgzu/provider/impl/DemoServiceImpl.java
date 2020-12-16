package com.github.mgzu.provider.impl;

import com.github.mgzu.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "0.1")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return name + " impl";
    }
}
