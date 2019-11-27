package com.nf.demo1.service.impl;

import com.nf.demo1.dao.EmployeeDao;
import com.nf.demo1.entity.EmployeeEntity;
import com.nf.demo1.service.EmployeeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl1 implements EmployeeService1 {

    @Autowired
    private EmployeeDao dao;
    @Override
    public List<EmployeeEntity> getAll1(int pageNum, int pageSize) {
        return dao.getAll1(pageNum,pageSize);
    }

    @Override
    public void insert1(EmployeeEntity employeeEntity) {
        dao.insert1(employeeEntity);
    }

}
