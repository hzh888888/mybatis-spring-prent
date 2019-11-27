package com.controller;

import com.entity.Employee;
import com.seriver.EmployeeServiceImpl;
import com.seriver.impl.EmployeeService;
import com.spring.ApplicationContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class SerlvetList extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmployeeService service= ApplicationContextHolder.getBean("employeeService", EmployeeServiceImpl.class);
        List<Employee> employees= service.getAll();

        req.setAttribute("emp", employees);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
