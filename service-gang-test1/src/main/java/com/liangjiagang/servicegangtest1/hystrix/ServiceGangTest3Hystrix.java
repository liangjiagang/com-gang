package com.liangjiagang.servicegangtest1.hystrix;

import com.liangjiagang.servicegangtest1.feign.ServiceGangTest3Feign;
import org.springframework.stereotype.Component;

@Component
public class ServiceGangTest3Hystrix implements ServiceGangTest3Feign {

    @Override
    public String hi3(String name) {
        return "这里是Test1，你请求test3失败了";
    }
}
