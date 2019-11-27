package com.service;

import com.alibaba.druid.pool.DruidDataSource;
import com.aop.LogAspect;
import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.dao.impl.DeptDaoImpl;
import com.dao.impl.EmployeeDaoIpml;
import com.service.impl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class HelloConfig {


//    @Bean
//    public LogAspect logAspect(){
//        return new LogAspect();
//    }
//
//    @Bean
//    public DeptDao deptDao(){
//        DeptDaoImpl deptDao=new DeptDaoImpl();
//        deptDao.setJdbcTemplate(jdbcTemplate());
//        return deptDao;
//    }
//
//    @Bean
//    public EmployeeDao employeeDao(){
//        EmployeeDaoIpml employeeDaoIpml=new EmployeeDaoIpml();
//        employeeDaoIpml.setJdbcTemplate(jdbcTemplate());
//        return employeeDaoIpml;
//    }
//
//    @Bean
//    public EmployeeServiceImpl employeeServiceImpl(){
//        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
//        employeeService.setDeptDao(deptDao());
//        employeeService.setEmployeeDao(employeeDao());
//        return employeeService;
//    }

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setPassword("1234");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        return dataSource;
    }


    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
