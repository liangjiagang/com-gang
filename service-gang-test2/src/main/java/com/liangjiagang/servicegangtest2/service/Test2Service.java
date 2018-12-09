package com.liangjiagang.servicegangtest2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Test2Service {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hi1Error")
    public String hi1(String name) {
        return restTemplate.getForObject("http://service-gang-test1/hi1?name="+name,String.class);
    }

    public String hi1Error(String name){
        return "这里是test2,你请求test1失败了";
    }

    @HystrixCommand(fallbackMethod = "hi3Error")
    public String hi3(String name) {
        return restTemplate.getForObject("http://service-gang-test3/hi3?name="+name,String.class);
    }

    public String hi3Error(String name){
        return "这里是test2,你请求test3失败了";
    }


}
