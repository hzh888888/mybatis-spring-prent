package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.service.EmployeeServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeServiceDao {

    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;

//    public void setDeptDao(DeptDao deptDao) {
//        this.deptDao = deptDao;
//    }
//
//    public void setEmployeeDao(EmployeeDao employeeDao) {
//        this.employeeDao = employeeDao;
//    }


    @Override
    @Transactional
    public void del() {
        deptDao.delete();
        employeeDao.insert();
    }

}
