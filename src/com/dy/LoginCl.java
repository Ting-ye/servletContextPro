package com.dy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginCl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String password= (String) request.getParameter("password");

        if("123".equals(password)){
            //先取出
            String nums= (String) this.getServletContext().getAttribute("nums");
            this.getServletContext().setAttribute("nums",(Integer.parseInt(nums)+1)+"");
            //再+1
            //再更新
            //像servletContext中添加属性

            //request.getRequestDispatcher("/showTimes").forward(request,response);
            //用重定向可以防止刷新页面访问次数也+1
            response.sendRedirect("/servletContextPro/showTimes");
        }else{

        }

    }
}
