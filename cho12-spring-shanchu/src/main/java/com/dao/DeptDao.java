package com.dao;

import java.sql.Connection;

public interface DeptDao {
   void deleteDeptById(Connection connection, int id);
}
