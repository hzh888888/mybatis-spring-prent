package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.service.DeptServiceDao;

public class DeptServiceImpl implements DeptServiceDao {

    private DeptDao deptDao;
    private EmployeeDao employeeDao;


    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void deleteWholeDeptById(int id) {
        employeeDao.deleteEmp(id);
        deptDao.deleteDept(id);
    }
}
