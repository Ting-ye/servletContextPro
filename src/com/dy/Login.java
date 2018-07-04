package com.dy;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "Login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>用户登录</h1>");
        out.println("<form action='/servletContextPro/LoginCl' method='post'>");
        out.println("用户id:<input type='text' name='id' /><br/>");
        out.println("密    码:<input type='password' name='password'/><br/>");
        out.println("<input type='submit' value='登录'/><br/>");
        out.println("</form>");
    }
}
