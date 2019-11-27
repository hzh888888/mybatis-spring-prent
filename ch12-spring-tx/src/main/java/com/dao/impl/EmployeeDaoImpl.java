package com.dao.impl;

import com.dao.EmployeeDao;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {
    @Override
    public void deleteEmp(int id) {
        String sql="delete from employee where deptid=?";
        jdbcTemplate.update(sql,id);
    }
}
