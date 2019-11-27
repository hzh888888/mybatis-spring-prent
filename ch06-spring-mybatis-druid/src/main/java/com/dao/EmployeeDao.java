package com.dao;

import com.entity.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeDao {

        @Select("select id,username from employee")
        List<Employee> getAll();
}
