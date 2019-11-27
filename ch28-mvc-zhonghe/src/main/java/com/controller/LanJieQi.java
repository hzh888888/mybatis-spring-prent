package com.controller;

import org.springframework.web.servlet.HandlerInterceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LanJieQi implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("name");
        if(username==null ){
            response.sendRedirect(request.getContextPath() + "/login2");
            return false;
        }
        return true;
    }

}
