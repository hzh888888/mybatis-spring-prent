package com.nf.demo1.dao;

import com.nf.demo1.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<EmployeeEntity> getAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);


    void insert (EmployeeEntity employeeEntity);

    void empDelete(int id);
}
