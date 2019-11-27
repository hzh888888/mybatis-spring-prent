package com.dao.impl;

import com.dao.EmployeeDao;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void deleteEmpsByDeptId(Connection connection, int deptid) {
        PreparedStatement prmt=null;
        try {
            prmt=connection.prepareStatement("delete from employee where deptid=?");
            prmt.setInt(1,deptid);
            prmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
