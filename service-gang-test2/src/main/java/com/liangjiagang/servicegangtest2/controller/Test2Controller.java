package com.liangjiagang.servicegangtest2.controller;

import com.liangjiagang.servicegangtest2.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {

    @Autowired
    private Test2Service test2Service;

    @Value("${eureka.instance.instance-id}")
    String id;

    @RequestMapping("/hi1")
    public String home(@RequestParam String name) {
        return test2Service.hi1(name);
    }

    @RequestMapping("/hi2")
    public String hi2(@RequestParam String name){
        return "hi2 "+name+",i am from port:" +id;
    }

    @RequestMapping("/hi3")
    public String hi3(@RequestParam String name){
        return test2Service.hi3(name);
    }



}
