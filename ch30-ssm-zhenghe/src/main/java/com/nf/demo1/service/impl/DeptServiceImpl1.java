package com.nf.demo1.service.impl;

import com.nf.demo1.dao.DeptDao;
import com.nf.demo1.dao.EmployeeDao;
import com.nf.demo1.service.DeptService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl1 implements DeptService1 {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DeptDao deptDao;

    @Transactional
    @Override
    public void deleteById(int deptid) {
        employeeDao.empDelete1(deptid);
        deptDao.del(deptid);
    }
}
