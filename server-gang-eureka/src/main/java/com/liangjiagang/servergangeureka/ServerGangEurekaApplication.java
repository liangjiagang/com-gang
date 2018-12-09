package com.liangjiagang.servergangeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerGangEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerGangEurekaApplication.class, args);
    }
}
