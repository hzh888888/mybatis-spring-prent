package com.nf.demo1.dao;

import com.nf.demo1.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<EmployeeEntity> getAll1(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);

    void insert1 (EmployeeEntity employeeEntity);

    void empDelete1(int id);
}
