package com.liangjiagang.servicegangweb.data.vo;

public class ProtfolioMenuVO {

    private String id;
    private String text;
    private String data_value;
    private String num;

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

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ProtfolioMenuVO{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", data_value='" + data_value + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
