package com.serivce.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.serivce.DeptSerivceDao;

public class DeptSerivceImpl implements DeptSerivceDao {

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
        employeeDao.dleteEmp(id);
        deptDao.deleteDep(id);
    }
}
