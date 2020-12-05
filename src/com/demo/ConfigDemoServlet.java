package com.demo;

import javax.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class ConfigDemoServlet extends javax.servlet.http.HttpServlet {
    String servletName=null;
    ServletConfig config=null;
    String email=null;
    String telephone=null;

    public void init() {
        config = getServletConfig();
        servletName = config.getServletName();
        email = config.getInitParameter("email");
        telephone = config.getInitParameter("telephone");
    }

    public void service(HttpServletRequest request , HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Servlet名称："+servletName+"<br>");
        out.println("Email地址："+email+"<br>");
        out.println("电话："+telephone);
        out.println("</body></html>");

    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }
}
