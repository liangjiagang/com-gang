package com.liangjiagang.servicegangzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerFilter extends ZuulFilter {

    private static Logger logger =  LoggerFactory.getLogger(LoggerFilter.class);

    /**
     *
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * 前置过滤器
     * @return string
     */

    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 优先级，数字越大，优先级越低
     * @return int
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行该过滤器，true代表需要过滤
     * @return boolean
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 要执行的逻辑
     * @return object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        return null;
    }

}
