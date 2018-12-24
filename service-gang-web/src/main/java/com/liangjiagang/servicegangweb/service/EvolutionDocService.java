package com.liangjiagang.servicegangweb.service;

import com.liangjiagang.servicegangweb.data.vo.DocBagMsgVO;
import com.liangjiagang.servicegangweb.data.vo.ProtfolioMenuVO;

import java.util.List;

public interface EvolutionDocService {

    List<ProtfolioMenuVO> getProtMenuList(String page);

    List<DocBagMsgVO> getDocBag(String doc_bag_label);
}
