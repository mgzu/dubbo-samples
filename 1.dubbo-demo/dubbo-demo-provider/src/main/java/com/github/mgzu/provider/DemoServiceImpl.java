package com.github.mgzu.provider;

import com.github.mgzu.api.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return name + " impl";
    }
}