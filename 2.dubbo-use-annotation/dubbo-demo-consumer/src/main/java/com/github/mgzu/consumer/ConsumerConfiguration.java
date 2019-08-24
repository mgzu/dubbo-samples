package com.github.mgzu.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.github.mgzu.consumer.action")
@PropertySource("classpath:/dubbo-consumer.properties")
@ComponentScan(value = {"com.github.mgzu.consumer.action"})
public class ConsumerConfiguration {
}
