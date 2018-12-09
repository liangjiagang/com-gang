package com.liangjiagang.servicegangtest3.hystrix;


import com.liangjiagang.servicegangtest3.feign.ServiceGangTest2Feign;
import org.springframework.stereotype.Component;

@Component
public class ServiceGangTest2Hystrix implements ServiceGangTest2Feign {

    @Override
    public String hi3(String name) {
        return "这里是Test3，你请求test2失败了";
    }
}
