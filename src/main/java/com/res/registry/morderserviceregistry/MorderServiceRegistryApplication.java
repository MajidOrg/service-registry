package com.res.registry.morderserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MorderServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MorderServiceRegistryApplication.class, args);
    }

}
