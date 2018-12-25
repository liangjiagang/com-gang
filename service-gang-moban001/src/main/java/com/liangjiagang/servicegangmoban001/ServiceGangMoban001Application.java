package com.liangjiagang.servicegangmoban001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceGangMoban001Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGangMoban001Application.class, args);
    }

}

