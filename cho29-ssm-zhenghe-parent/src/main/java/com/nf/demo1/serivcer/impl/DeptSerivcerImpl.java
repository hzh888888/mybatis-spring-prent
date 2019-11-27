package com.nf.demo1.serivcer.impl;

import com.nf.demo1.dao.DeptDao;
import com.nf.demo1.dao.EmployeeDao;
import com.nf.demo1.serivcer.DeptSerivcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptSerivcerImpl implements DeptSerivcer {

    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDao.empDelete(id);
        deptDao.Depdelete(id);
    }
}
