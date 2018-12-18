package com.liangjiagang.servicegangweb.service.impl;

import com.liangjiagang.servicegangweb.data.vo.MainMenuVO;
import com.liangjiagang.servicegangweb.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Override
    public List<MainMenuVO> getMainMenuList() {

        List<MainMenuVO> list = new ArrayList<>();
        MainMenuVO mainMenuVO1 = new MainMenuVO();
        mainMenuVO1.setId("10010000");
        mainMenuVO1.setText("首页");
        mainMenuVO1.setHref("/");
        MainMenuVO mainMenuVO2 = new MainMenuVO();
        mainMenuVO2.setId("10020000");
        mainMenuVO2.setText("进化文档");
        mainMenuVO2.setHref("/evolutiondoc");
        MainMenuVO mainMenuVO3 = new MainMenuVO();
        mainMenuVO3.setId("10030000");
        mainMenuVO3.setText("排行榜");
        mainMenuVO3.setHref("#");
        MainMenuVO mainMenuVO4 = new MainMenuVO();
        mainMenuVO4.setId("10040000");
        mainMenuVO4.setText("写文档");
        mainMenuVO4.setHref("#");
        MainMenuVO mainMenuVO5 = new MainMenuVO();
        mainMenuVO5.setId("10050000");
        mainMenuVO5.setText("登录");
        mainMenuVO5.setHref("#");
        MainMenuVO mainMenuVO6 = new MainMenuVO();
        mainMenuVO6.setId("10060000");
        mainMenuVO6.setText("注册");
        mainMenuVO6.setHref("#");
        MainMenuVO mainMenuVO9 = new MainMenuVO();
        mainMenuVO9.setId("10090000");
        mainMenuVO9.setText("简历");
        mainMenuVO9.setHref("#");


        List<MainMenuVO> list1 = new ArrayList<>();
        MainMenuVO mainMenuVO8 = new MainMenuVO();
        mainMenuVO8.setId("10020100");
        mainMenuVO8.setText("spring cloud");
        mainMenuVO8.setHref("/");
        MainMenuVO mainMenuVO7 = new MainMenuVO();
        mainMenuVO7.setId("10020200");
        mainMenuVO7.setText("java");
        mainMenuVO7.setHref("/");
        list1.add(mainMenuVO8);
        list1.add(mainMenuVO7);
        mainMenuVO3.setList(list1);

        list.add(mainMenuVO1);
        list.add(mainMenuVO2);
        list.add(mainMenuVO9);
        list.add(mainMenuVO3);
        list.add(mainMenuVO4);
        list.add(mainMenuVO5);
        list.add(mainMenuVO6);

        return list;
    }
}
