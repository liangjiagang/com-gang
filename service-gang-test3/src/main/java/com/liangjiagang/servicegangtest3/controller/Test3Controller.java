package com.liangjiagang.servicegangtest3.controller;


import com.liangjiagang.servicegangtest3.feign.SchedualClientEurekaTest1;
import com.liangjiagang.servicegangtest3.feign.ServiceGangTest2Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Test3Controller {

    /*编辑器没有发现实现类报错，不用管*/
    @Autowired
    SchedualClientEurekaTest1 schedualClientEurekaTest1;

    @Autowired
    ServiceGangTest2Feign serviceGangTest2Feign;

    @Value("${aa}")
    String aa;
    @Value("${eureka.instance.instance-id}")
    String id;

    @RequestMapping("/hi1")
    public String hi1(@RequestParam String name){
        return schedualClientEurekaTest1.hi("hi1"+name+aa);
    }

    @RequestMapping("/hi2")
    public String hi2(@RequestParam String name){
        return serviceGangTest2Feign.hi3("hi2"+name+aa);
    }

    @RequestMapping(value = "/hi3",method = RequestMethod.GET)
    public  String hi3(String name){
        return id;
    }

}
