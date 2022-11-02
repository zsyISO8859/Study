package com.atguigu.javaweb.Servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author : zhousy
 * @date : 2022/11/2 9:31
 * @version : 1.0
 */


public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("0---构造方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("1---init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("2---getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet。。。。。。。");
        System.out.println("3---service");
        //ServletContext servletContext = getServletConfig().getServletContext();
        //System.out.println(servletContext.getRealPath("/"));
    }

    @Override
    public String getServletInfo() {
        System.out.println("4---getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("5---destroy");
    }
}
