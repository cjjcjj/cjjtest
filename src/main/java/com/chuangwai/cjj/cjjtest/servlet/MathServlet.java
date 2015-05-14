package com.chuangwai.cjj.cjjtest.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xingshi on 15/5/14.
 */
public class MathServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            response.getWriter().write(aa + bb);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
