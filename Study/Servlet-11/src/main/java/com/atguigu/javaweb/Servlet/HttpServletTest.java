package com.atguigu.javaweb.Servlet; /**
 * @author : zhousy
 * @date : 2022/11/2 11:05
 * @version : 1.0
 */


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HttpServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        System.out.println(servletContext.getRealPath("/"));
        System.out.println(servletContext.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
