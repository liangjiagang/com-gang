package com.liangjiagang.servicegangtest3.feign;


import com.liangjiagang.servicegangtest3.hystrix.ServiceGangTest2Hystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-gang-test2",fallback = ServiceGangTest2Hystrix.class)
public interface ServiceGangTest2Feign {

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    String hi3(@RequestParam(value = "name") String name);

}
