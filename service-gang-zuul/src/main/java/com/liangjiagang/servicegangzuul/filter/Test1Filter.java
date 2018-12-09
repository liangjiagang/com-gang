package com.liangjiagang.servicegangzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class Test1Filter extends ZuulFilter {

    private static Logger logger =  LoggerFactory.getLogger(Test1Filter.class);


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
        return 100;
    }

    /**
     * 是否执行该过滤器，true代表需要过滤
     * @return boolean
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 要执行的逻辑
     * @return object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String contextPath = request.getServletPath();
        if(contextPath!=null&&!contextPath.contains("/test1")){
            return null;
        }
        //logger.info("%s >>> %s ",request.getMethod(),request.getRequestURL().toString());
        Object accexxToken = request.getParameter("token");
        if(accexxToken == null){
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                logger.error("token is empty 响应错误",e);
            }
            return null;
        }
        //logger.info("ok");
        return null;
    }
}
