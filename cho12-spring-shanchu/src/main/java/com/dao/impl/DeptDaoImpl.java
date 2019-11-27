package com.dao.impl;

import com.dao.DeptDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDaoImpl implements DeptDao {
    @Override
    public void deleteDeptById(Connection connection, int id) {
        PreparedStatement prmt=null;
        try {
            prmt=connection.prepareStatement("delete from dept where id=?");
            prmt.setInt(1,id);
            prmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
}
