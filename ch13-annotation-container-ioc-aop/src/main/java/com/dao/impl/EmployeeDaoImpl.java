package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void insert() {
        System.out.println("insert0----------------");
    }
}
