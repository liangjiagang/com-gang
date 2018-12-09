package com.liangjiagang.servicegangtest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ServiceGangTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGangTest2Application.class, args);
    }
}
