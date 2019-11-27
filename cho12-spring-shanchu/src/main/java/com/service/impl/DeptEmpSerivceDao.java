package com.service.impl;

import java.sql.Connection;

public interface DeptEmpSerivceDao {
   void deleteDeptWithEmps(Connection conn, int deptid);
}
