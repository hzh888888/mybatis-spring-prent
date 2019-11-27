package com.nf.demo1.serivcer.impl;

import com.nf.demo1.dao.EmployeeDao;
import com.nf.demo1.entity.EmployeeEntity;
import com.nf.demo1.serivcer.EmployeeSerivcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeSerivcerImpl implements EmployeeSerivcer {
  @Autowired
    private EmployeeDao dao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum,pageSize);
    }

  @Override
  public void insert(EmployeeEntity employeeEntity) {
    dao.insert(employeeEntity);
  }
}
