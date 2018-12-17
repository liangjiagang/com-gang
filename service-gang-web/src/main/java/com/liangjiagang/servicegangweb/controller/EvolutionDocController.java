package com.liangjiagang.servicegangweb.controller;

import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import com.liangjiagang.servicegangweb.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EvolutionDocController {

    private static final Logger logger = LoggerFactory.getLogger(EvolutionDocController.class);

    @Autowired
    private IndexService indexService;


    @RequestMapping(value = "/evolutiondoc")
    public String evolutionDoc(ModelMap modelMap){
        List<MainMenuVO> mainMenuList = indexService.getMainMenuList();
        modelMap.put("main_menu_list",mainMenuList);
        return "evolutiondoc";
    }


}
