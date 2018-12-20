package com.liangjiagang.servicegangweb.controller;

import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import com.liangjiagang.servicegangweb.data.vo.ProtMenuVO;
import com.liangjiagang.servicegangweb.data.vo.ProtfolioMenuVO;
import com.liangjiagang.servicegangweb.service.EvolutionDocService;
import com.liangjiagang.servicegangweb.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/evolutiondoc")
public class EvolutionDocController {

    private static final Logger logger = LoggerFactory.getLogger(EvolutionDocController.class);

    @Autowired
    private IndexService indexService;

    @Autowired
    private EvolutionDocService evolutionDocService;

    @RequestMapping
    public String evolutionDoc(ModelMap modelMap){
        List<MainMenuVO> mainMenuList = indexService.getMainMenuList();
        modelMap.put("main_menu_list",mainMenuList);
        List<ProtfolioMenuVO> protMenuList = evolutionDocService.getProtMenuList("0");
        modelMap.put("protf_menu_list",protMenuList);
        modelMap.put("protf_all_num",10000);
        modelMap.put("protf_next_num",1);

        return "evolutiondoc";
    }

    @RequestMapping(value = "/getprotmenu.do")
    @ResponseBody
    public String getProtMenu(ModelMap modelMap, @RequestBody @Validated ProtMenuVO protMenuVO){
        List<ProtfolioMenuVO> protMenuList = evolutionDocService.getProtMenuList(protMenuVO.getPage());
        modelMap.put("protf_menu_list",protMenuList);
        modelMap.put("protf_all_num",10000);
        modelMap.put("protf_next_num", 1+Integer.valueOf(protMenuVO.getPage()));
        modelMap.put("protf_last_num", 1-Integer.valueOf(protMenuVO.getPage()));

        return "evolutiondoc::table_refresh";
    }


}
