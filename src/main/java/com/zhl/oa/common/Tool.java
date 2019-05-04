package com.zhl.oa.common;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName Tool
 * @Description TODO
 * @Author Administrator
 * @Date 2019/4/27 0027 18:36
 * @Version 1.0
 */
public class Tool {
    public static  <T>T getBean(Class<T> clazz, HttpServletRequest request) {
        WebApplicationContext wc=   WebApplicationContextUtils.getWebApplicationContext(
                request.getServletContext());
        return wc.getBean(clazz);
    }
}
