package com.multi;

import com.multi.dao.Employee1Dao;
import com.multi.dao.Employee1DaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public Employee1Dao employeeDao(){
        return new Employee1DaoImpl();
    }

}
