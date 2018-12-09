package com.liangjiagang.servicegangzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ServiceGangZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGangZipkinApplication.class, args);
    }
}
