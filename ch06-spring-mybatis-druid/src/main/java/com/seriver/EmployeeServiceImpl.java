package com.seriver;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.seriver.impl.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl  implements EmployeeService {

    private EmployeeDao dao;
    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Employee> getAll() {
        return dao.getAll();
    }
}
