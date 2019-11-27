package com.nf.demo1.serivcer;

import com.nf.demo1.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeSerivcer {

    List<EmployeeEntity> getAll(int pageNum,int pageSize);

    void insert (EmployeeEntity employeeEntity);

}
