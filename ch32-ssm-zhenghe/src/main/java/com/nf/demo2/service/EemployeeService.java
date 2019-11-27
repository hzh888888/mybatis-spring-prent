package com.nf.demo2.service;

import com.nf.demo2.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EemployeeService {

    List<EmployeeEntity> getAll2(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    void insert2(EmployeeEntity employeeEntity);

}
