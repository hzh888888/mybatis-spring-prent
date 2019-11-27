package com.serivce.impl;

import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import com.serivce.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeSerivceImpl implements EmployeeSerivce {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeEntity> getAll1(int pageNum, int pageSize) {
        return employeeDao.getAll1(pageNum,pageSize);
    }

    @Override
    public void insert1(EmployeeEntity employeeEntity) {
            employeeDao.insert1(employeeEntity);
    }
}
