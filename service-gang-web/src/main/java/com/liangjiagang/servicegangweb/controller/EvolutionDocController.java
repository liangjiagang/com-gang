package com.liangjiagang.servicegangweb.controller;

import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import com.liangjiagang.servicegangweb.data.vo.ProtfolioMenuVO;
import com.liangjiagang.servicegangweb.service.EvolutionDocService;
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

    @Autowired
    private EvolutionDocService evolutionDocService;

    @RequestMapping(value = "/evolutiondoc")
    public String evolutionDoc(ModelMap modelMap){
        List<MainMenuVO> mainMenuList = indexService.getMainMenuList();
        modelMap.put("main_menu_list",mainMenuList);
        List<ProtfolioMenuVO> protMenuList = evolutionDocService.getProtMenuList("1");
        modelMap.put("protf_menu_list",protMenuList);
        modelMap.put("protf_all_num",10000);

        return "evolutiondoc";
    }


}
