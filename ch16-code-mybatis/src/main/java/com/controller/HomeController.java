package com.controller;

import com.entity.Employee;
import com.github.pagehelper.PageInfo;
import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class HomeController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context= WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        EmployeeService service=context.getBean(EmployeeService.class);
        int pageNum= ServletRequestUtils.getIntParameter(req,"pageNum",1);
        int pageSize=ServletRequestUtils.getIntParameter(req,"pageSize",2);
        List<Employee> employees=service.getAll(pageNum,pageSize);
        PageInfo<Employee> pageInfo=new PageInfo<>(employees);
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
