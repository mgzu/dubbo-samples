package com.github.mgzu.consumer;

import com.github.mgzu.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class DubboConsumerApplication {

    @DubboReference(version = "1.0.1")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            log.info(demoService.sayHello("dubbo"));
        };
    }
}
