package com.nf.demo2.service.imp;

import com.nf.demo2.dao.EmployeeDao;
import com.nf.demo2.entity.EmployeeEntity;
import com.nf.demo2.service.EemployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EemployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<EmployeeEntity> getAll2(int pageNum, int pageSize) {
        return employeeDao.getAll2(pageNum,pageSize);
    }

    @Override
    public void insert2(EmployeeEntity employeeEntity) {
        employeeDao.insert2(employeeEntity);
    }
}
