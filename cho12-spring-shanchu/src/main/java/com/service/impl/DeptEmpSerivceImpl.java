package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;

import java.sql.Connection;

public class DeptEmpSerivceImpl implements DeptEmpSerivceDao {

    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void deleteDeptWithEmps(Connection conn, int deptid) {
        employeeDao.deleteEmpsByDeptId(conn,deptid);
        deptDao.deleteDeptById(conn,deptid);
    }
}
