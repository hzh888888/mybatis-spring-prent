package com.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;

public class DruidDataSourceFactoryBean implements FactoryBean<DataSource> {
    @Override
    public DataSource getObject() throws Exception {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        return dataSource;
    }

    @Override
    public Class<?> getObjectType() {
        return DataSource.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
