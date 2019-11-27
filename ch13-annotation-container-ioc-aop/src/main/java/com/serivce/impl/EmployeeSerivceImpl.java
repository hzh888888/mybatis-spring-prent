package com.serivce.impl;

import com.dao.EmployeeDao;
import com.serivce.EmployeeSerivce;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Service
@Scope("singleton")
public class EmployeeSerivceImpl implements EmployeeSerivce {
    @Autowired
    @Qualifier("employeeDaoImpl2")
    private EmployeeDao dao;

    @Autowired
    private List<EmployeeDao> employeeDaos;

    @Autowired
    private Map<String,EmployeeDao> employeeDaoMap;
    @Override
    public void insert() {
        dao.insert();
    }

    @PostConstruct
    public void init(){
        System.out.println("init------------");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy----------");
    }

    public void displayAutowireCollectionInject(){
        for (EmployeeDao dao:employeeDaos){
            System.out.println(dao);
        }

        System.out.println("map-----------------");
        for (Map.Entry<String,EmployeeDao> entry:employeeDaoMap.entrySet()){
            System.out.println("key:"+entry.getKey()+";value:"+entry.getValue());
        }
    }
}
