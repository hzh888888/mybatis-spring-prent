package com.multi.service;

import com.multi.dao.Employee1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employee1ServiceImpl implements EmployeeService {
    @Autowired
    private Employee1Dao dao;

    public void setDao(Employee1Dao dao) {
        this.dao = dao;
    }

    @Override
    public void insert() {
        dao.insert();
    }
}
