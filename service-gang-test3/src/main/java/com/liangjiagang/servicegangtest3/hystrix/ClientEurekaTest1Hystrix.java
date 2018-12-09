package com.liangjiagang.servicegangtest3.hystrix;


import com.liangjiagang.servicegangtest3.feign.SchedualClientEurekaTest1;
import org.springframework.stereotype.Component;

@Component
public class ClientEurekaTest1Hystrix implements SchedualClientEurekaTest1 {

    @Override
    public String hi(String name) {
        return "这里是Test3，你请求test1失败了";
    }
}
