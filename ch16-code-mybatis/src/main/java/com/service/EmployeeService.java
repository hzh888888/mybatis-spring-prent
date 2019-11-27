package com.service;

import com.entity.Employee;

import java.util.List;

public interface EmployeeService {

   void txDemo(int id,String name);
   List<Employee> getAll(int pageNum, int pageSize);
}
