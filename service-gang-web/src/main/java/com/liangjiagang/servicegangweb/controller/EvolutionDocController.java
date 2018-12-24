package com.liangjiagang.servicegangweb.controller;

import com.liangjiagang.servicegangweb.data.vo.DocBagMsgVO;
import com.liangjiagang.servicegangweb.data.vo.EvolutiondocVO;
import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import com.liangjiagang.servicegangweb.data.vo.ProtfolioMenuVO;
import com.liangjiagang.servicegangweb.service.EvolutionDocService;
import com.liangjiagang.servicegangweb.service.IndexService;
import com.liangjiagang.servicegangweb.validation.GetDocBagIntf;
import com.liangjiagang.servicegangweb.validation.GetProtMenuIntf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
        List<DocBagMsgVO> list =  evolutionDocService.getDocBag("aaa");
        modelMap.put("doc_bag_msg_list",list);

        return "evolutiondoc";
    }

    /**
     * 分页获取档案袋标签
     * @param modelMap
     * @param evolutiondocVO
     * @return
     */
    @RequestMapping(value = "/getprotmenu.do")
    public String getProtMenu(ModelMap modelMap, @RequestBody @Validated({GetProtMenuIntf.class}) EvolutiondocVO evolutiondocVO){
        List<ProtfolioMenuVO> protMenuList = evolutionDocService.getProtMenuList(evolutiondocVO.getPage());
        modelMap.put("protf_menu_list",protMenuList);
        modelMap.put("protf_all_num",10000);
        modelMap.put("protf_next_num", 1+Integer.valueOf(evolutiondocVO.getPage()));
        modelMap.put("protf_last_num", 1-Integer.valueOf(evolutiondocVO.getPage()));

        return "evolutiondoc::table_refresh";
    }

    /**
     * 根据标签获取文档袋列表
     * @param modelMap
     * @param evolutiondocVO
     * @return
     */
    @RequestMapping(value = "/getdocbag.do")
    public String getDocBag(ModelMap modelMap, @RequestBody @Validated({GetDocBagIntf.class}) EvolutiondocVO evolutiondocVO){
        List<DocBagMsgVO> list =  evolutionDocService.getDocBag(evolutiondocVO.getDoc_bag_label());
        modelMap.put("doc_bag_msg_list",list);
        return "evolutiondoc::protfolio-active";
    }


}
