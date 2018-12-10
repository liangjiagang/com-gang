package com.liangjiagang.servicegangweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //thymeleaf不能使用restController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("textValue","hello woled");
        return "index";
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("message/list");
        mav.addObject("textValue","hello woled");
        return mav;
    }


}
