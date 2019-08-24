package com.github.mgzu.consumer;

import com.github.mgzu.consumer.action.DemoAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        // Obtaining a remote service proxy
        DemoAction demoAction = (DemoAction) context.getBean("demoAction");
        // Executing remote methods
        String hello = demoAction.doSayHello("world");
        // Display the call result
        System.out.println(hello);
    }
}