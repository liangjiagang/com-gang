package com.liangjiagang.servicegangweb.data.vo;

import java.util.List;

public class MainMenuVO {

    private String id;
    private String text;
    private String href;
    private List<MainMenuVO> list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<MainMenuVO> getList() {
        return list;
    }

    public void setList(List<MainMenuVO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MainMenuVO{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", href='" + href + '\'' +
                ", list=" + list +
                '}';
    }
}
