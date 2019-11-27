package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@MapperScan("com.dao")
@ComponentScan("com.service")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class AppConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setPassword(password);
        dataSource.setUsername(username);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory()throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        PathMatchingResourcePatternResolver patternResolver=new PathMatchingResourcePatternResolver();
        Resource[] resources = patternResolver.getResources("classpath*:com/dao/mappers/*Mapper.xml");
            sqlSessionFactoryBean.setMapperLocations(resources);

            sqlSessionFactoryBean.setConfiguration(configuration());

            sqlSessionFactoryBean.setPlugins(pageInterceptor());
            return sqlSessionFactoryBean.getObject();
    }

        @Bean
    public DataSourceTransactionManager txManager(){
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

    @Bean
    public org.apache.ibatis.session.Configuration configuration(){
        org.apache.ibatis.session.Configuration configuration=new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }

    @Bean
    public PageInterceptor pageInterceptor(){
        PageInterceptor pageInterceptor=new PageInterceptor();
        Properties properties=new Properties();
        properties.put("supportMethodsArguments","true");
        properties.put("reasonable","true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }
}
