package com.github.mgzu.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.github.mgzu.provider.impl")
@PropertySource("classpath:/dubbo-provider.properties")
public class ProviderConfiguration {
}
