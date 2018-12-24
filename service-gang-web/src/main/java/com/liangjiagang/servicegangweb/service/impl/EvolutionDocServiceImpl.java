package com.liangjiagang.servicegangweb.service.impl;

import com.liangjiagang.servicegangweb.common.RandomColor;
import com.liangjiagang.servicegangweb.data.vo.DocBagMsgVO;
import com.liangjiagang.servicegangweb.data.vo.ProtfolioMenuVO;
import com.liangjiagang.servicegangweb.service.EvolutionDocService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvolutionDocServiceImpl implements EvolutionDocService {

    @Override
    public List<ProtfolioMenuVO> getProtMenuList(String page) {
        List<ProtfolioMenuVO> list = new ArrayList<>();

        if ("0".equals(page)){
            for (int i = 0; i < 5 ; i++) {
                ProtfolioMenuVO protfolioMenuVO = new ProtfolioMenuVO();
                protfolioMenuVO.setId(i + "");
                protfolioMenuVO.setText("aaaa");
                protfolioMenuVO.setData_value("aaa");
                protfolioMenuVO.setNum("123");
                list.add(protfolioMenuVO);
            }
        }else {
            for (int i = 0; i < 10 ; i++) {
                ProtfolioMenuVO protfolioMenuVO = new ProtfolioMenuVO();
                protfolioMenuVO.setId(i+"1");
                protfolioMenuVO.setText("bbbb");
                protfolioMenuVO.setData_value("bbb");
                protfolioMenuVO.setNum("77");
                list.add(protfolioMenuVO);
            }
        }
        return list;
    }

    @Override
    public List<DocBagMsgVO> getDocBag(String doc_bag_label) {
        List<DocBagMsgVO> list = new ArrayList<>();
        if("aaa".equals(doc_bag_label)){
            for (int i = 0; i <12 ; i++) {
                DocBagMsgVO docBagMsgVO = new DocBagMsgVO();
                docBagMsgVO.setId(i+"");
                docBagMsgVO.setTitle("spring cloud 从入门到放弃的啦啦啦啦");
                docBagMsgVO.setAuthor("二大爷");
                docBagMsgVO.setUpdate_time("2018-09-08 12:33:44");
                docBagMsgVO.setPraise_num("123");
                docBagMsgVO.setRead_num("456");
                docBagMsgVO.setVersion_num("10");
                docBagMsgVO.setBackground_color(RandomColor.getRandomColor());
                list.add(docBagMsgVO);
            }
        }else if ("bbb".equals(doc_bag_label)){

            for (int i = 0; i <12 ; i++) {
                DocBagMsgVO docBagMsgVO = new DocBagMsgVO();
                docBagMsgVO.setId(i+"");
                docBagMsgVO.setTitle("spring boot 从入门到放弃的啦啦啦啦");
                docBagMsgVO.setAuthor("三大爷");
                docBagMsgVO.setUpdate_time("2018-09-08 12:33:44");
                docBagMsgVO.setPraise_num("123");
                docBagMsgVO.setRead_num("456");
                docBagMsgVO.setVersion_num("10");
                docBagMsgVO.setBackground_color(RandomColor.getRandomColor());
                list.add(docBagMsgVO);
            }

        }

        return list;
    }


}
