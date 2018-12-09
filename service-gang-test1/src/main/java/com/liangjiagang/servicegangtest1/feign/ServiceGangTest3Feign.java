package com.liangjiagang.servicegangtest1.feign;

import com.liangjiagang.servicegangtest1.hystrix.ServiceGangTest3Hystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-gang-test3",fallback = ServiceGangTest3Hystrix.class)
public interface ServiceGangTest3Feign {

    @RequestMapping(value = "/hi3",method = RequestMethod.GET)
    String hi3(@RequestParam(value = "name") String name);

}
