package com.serivce;

import com.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeSerivce {

    List<EmployeeEntity> getAll1(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    void insert1 (EmployeeEntity employeeEntity);
}
