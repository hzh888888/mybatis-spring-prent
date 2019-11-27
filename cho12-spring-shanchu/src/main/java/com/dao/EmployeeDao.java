package com.dao;

import java.sql.Connection;

public interface EmployeeDao {

    void deleteEmpsByDeptId(Connection connection, int deptid);
}
