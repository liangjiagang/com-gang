package com.liangjiagang.servicegangtest3.feign;


import com.liangjiagang.servicegangtest3.hystrix.ClientEurekaTest1Hystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-gang-test1",fallback = ClientEurekaTest1Hystrix.class)
public interface SchedualClientEurekaTest1 {

    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);

}
