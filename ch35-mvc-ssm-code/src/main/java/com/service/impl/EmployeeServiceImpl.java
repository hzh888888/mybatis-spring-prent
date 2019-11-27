package com.service.impl;

import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum,pageSize);
    }
}
