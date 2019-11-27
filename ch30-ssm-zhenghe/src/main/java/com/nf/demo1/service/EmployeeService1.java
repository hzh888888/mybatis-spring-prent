package com.nf.demo1.service;

import com.nf.demo1.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService1 {

    List<EmployeeEntity> getAll1(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    void insert1 (EmployeeEntity employeeEntity);

}
