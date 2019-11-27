package com.serivce.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.serivce.DeptSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptSerivceImpl implements DeptSerivce {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DeptDao deptDao;

    @Transactional
    @Override
    public void del(int id) {
        employeeDao.empDelete1(id);
        deptDao.deptDel(id);
    }
}
