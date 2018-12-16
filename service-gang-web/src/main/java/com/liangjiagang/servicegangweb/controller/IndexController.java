package com.liangjiagang.servicegangweb.controller;

import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller //thymeleaf不能使用restController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public String hello(ModelMap modeMap) {

        List<MainMenuVO> list = new ArrayList<>();
        MainMenuVO mainMenuVO1 = new MainMenuVO();
        mainMenuVO1.setId("10010000");
        mainMenuVO1.setText("首页");
        mainMenuVO1.setHref("/");
        MainMenuVO mainMenuVO2 = new MainMenuVO();
        mainMenuVO2.setId("10020000");
        mainMenuVO2.setText("进化文档");
        mainMenuVO2.setHref("/");
        MainMenuVO mainMenuVO3 = new MainMenuVO();
        mainMenuVO3.setId("10030000");
        mainMenuVO3.setText("排行榜");
        mainMenuVO3.setHref("#");
        MainMenuVO mainMenuVO4 = new MainMenuVO();
        mainMenuVO4.setId("10040000");
        mainMenuVO4.setText("登录");
        mainMenuVO4.setHref("#");
        MainMenuVO mainMenuVO5 = new MainMenuVO();
        mainMenuVO5.setId("10050000");
        mainMenuVO5.setText("注册");
        mainMenuVO5.setHref("#");

        List<MainMenuVO> list1 = new ArrayList<>();
        MainMenuVO mainMenuVO6 = new MainMenuVO();
        mainMenuVO6.setId("10020100");
        mainMenuVO6.setText("spring cloud");
        mainMenuVO6.setHref("/");
        MainMenuVO mainMenuVO7 = new MainMenuVO();
        mainMenuVO7.setId("10020200");
        mainMenuVO7.setText("java");
        mainMenuVO7.setHref("/");
        list1.add(mainMenuVO6);
        list1.add(mainMenuVO7);
        mainMenuVO3.setList(list1);

        list.add(mainMenuVO1);
        list.add(mainMenuVO2);
        list.add(mainMenuVO3);
        list.add(mainMenuVO4);
        list.add(mainMenuVO5);

        modeMap.put("main_menu_list",list);
        return "index";
    }

}
