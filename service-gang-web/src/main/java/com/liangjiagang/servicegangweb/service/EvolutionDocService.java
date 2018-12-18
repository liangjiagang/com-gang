package com.liangjiagang.servicegangweb.service;

import com.liangjiagang.servicegangweb.data.vo.ProtfolioMenuVO;

import java.util.List;

public interface EvolutionDocService {

    List<ProtfolioMenuVO> getProtMenuList(String page);

}
