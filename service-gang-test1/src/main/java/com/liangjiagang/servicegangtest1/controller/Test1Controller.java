package com.liangjiagang.servicegangtest1.controller;

import com.liangjiagang.servicegangtest1.feign.ServiceGangTest2Feign;
import com.liangjiagang.servicegangtest1.feign.ServiceGangTest3Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {

    @Value("${eureka.instance.instance-id}")
    String id;

    @Autowired
    private ServiceGangTest3Feign serviceGangTest3Feign;
    @Autowired
    private ServiceGangTest2Feign serviceGangTest2Feign;

    @RequestMapping("/hi1")
    public String home(@RequestParam String name) {

        String aa = "111";
        String bb = "222";
        String cc = "333";
        return "hi1"+name+",i am from port:" +id;
    }

    @RequestMapping("/hi2")
    public String hi2(@RequestParam String name){
        return serviceGangTest2Feign.hi3(name);
    }

    @RequestMapping("/hi3")
    public String hi3(@RequestParam String name){
        return serviceGangTest3Feign.hi3(name);
    }



}
