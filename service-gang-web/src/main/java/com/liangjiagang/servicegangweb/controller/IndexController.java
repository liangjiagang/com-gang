package com.liangjiagang.servicegangweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("textValue","hello woled");
        return "/index-1";
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        return new ModelAndView("index-1");
    }


}
