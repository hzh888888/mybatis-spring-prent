package com.dao.impl;

import com.dao.DeptDao;

public class DeptDaoImpl extends BaseDao implements DeptDao {
    @Override
    public void deleteDep(int id) {
        String sql="delete from dept where id=?";
        jdbcTemplate.update(sql,id);
    }
}
