package com.multi;


import com.multi.dao.Employee1Dao;
import com.multi.service.Employee1ServiceImpl;
import com.multi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class ServiceConfig {

    @Autowired
    private Employee1Dao dao;

    @Bean
    public EmployeeService employeeService(){
        Employee1ServiceImpl employeeService= new Employee1ServiceImpl();
        employeeService.setDao(dao);
        return employeeService;
    }
}
