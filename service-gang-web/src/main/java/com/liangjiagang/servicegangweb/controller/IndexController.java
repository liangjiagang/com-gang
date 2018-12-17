package com.liangjiagang.servicegangweb.controller;

import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import com.liangjiagang.servicegangweb.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller //thymeleaf不能使用restController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/")
    public String hello(ModelMap modelMap, HttpServletRequest request) {
        List<MainMenuVO> mainMenuList = indexService.getMainMenuList();
        modelMap.put("main_menu_list",mainMenuList);
        return "index";
    }

}
