package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl2 implements EmployeeDao {
    @Override
    public void insert() {
        System.out.println("insert2222----------------");
    }
}
