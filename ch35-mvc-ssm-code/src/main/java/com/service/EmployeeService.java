package com.service;

import com.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> getAll(int pageNum,int pageSize);

}
