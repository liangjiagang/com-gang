package com.liangjiagang.servicegangevolutionbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class ServiceGangEvolutionbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGangEvolutionbookApplication.class, args);
    }

}

