package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.resourceloading.AggregateResourceBundleLocator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class DemoApplication {

//    @Value("${my.greeting}")
//    private String greeting;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
