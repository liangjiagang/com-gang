package com.liangjiagang.servicegangweb.service.impl;

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
}
