package com.liangjiagang.servicegangweb.data.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.liangjiagang.servicegangweb.validation.GetDocBagIntf;
import com.liangjiagang.servicegangweb.validation.GetProtMenuIntf;
import org.hibernate.validator.constraints.NotEmpty;

public class EvolutiondocVO {

    @JsonProperty("page")
    @NotEmpty(message = "page不能为空", groups = {GetProtMenuIntf.class})
    private String page;

    @JsonProperty("doc_bag_label")
    @NotEmpty(message = "doc_bag_label不能为空", groups = {GetDocBagIntf.class})
    private String doc_bag_label;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getDoc_bag_label() {
        return doc_bag_label;
    }

    public void setDoc_bag_label(String doc_bag_label) {
        this.doc_bag_label = doc_bag_label;
    }
}