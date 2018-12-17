package com.liangjiagang.servicegangweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EvolutionDocController {

    @RequestMapping(value = "/evolutiondoc")
    public String evolutionDoc(){
        return "evolutiondoc";
    }


}
