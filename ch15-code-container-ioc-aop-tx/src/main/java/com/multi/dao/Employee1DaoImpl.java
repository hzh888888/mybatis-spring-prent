package com.multi.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Employee1DaoImpl implements Employee1Dao{
    @Override
    public void insert() {
        System.out.println("insert------------");
    }
}
