package com.liangjiagang.servicegangweb.data.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class ProtMenuVO {

    @JsonProperty("page")
    @NotEmpty(message = "{user.name.notBlank}")
    private String page;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "ProtMenuVO{" +
                "page='" + page + '\'' +
                '}';
    }
}
