package com.nf.demo2.service.imp;

import com.nf.demo2.dao.DeptDao;
import com.nf.demo2.dao.EmployeeDao;
import com.nf.demo2.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DeptDao deptDao;

    @Transactional
    @Override
    public void del(int id) {
        employeeDao.empDelete2(id);
        deptDao.del(id);
    }
}
