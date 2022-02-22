package com.example.java8test;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author：ly
 * @Data :14:02 2022/1/7
 **/
//@WebFilter(urlPatterns = "/*",filterName = "testfilter")
public class Testfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始");
        System.out.println(servletRequest.getParameter("user"));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("结束");
    }

    @Override
    public void destroy() {
        //System.out.println("结束");
        Filter.super.destroy();
    }
}
