package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void txDemo(int id,String name) {
        deptDao.delete(id);
        employeeDao.insert(name);
    }

    @Override
    public List<Employee> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum,pageSize);
    }
}
