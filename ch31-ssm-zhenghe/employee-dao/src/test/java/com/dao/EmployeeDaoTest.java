package com.dao;

import com.entity.EmployeeEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dao-spring.xml")
public class EmployeeDaoTest {

    @Autowired
    private EmployeeDao dao;

    @Test
    public void Test(){
        List<EmployeeEntity> employeeEntities=dao.getAll1(1,2);
        for (EmployeeEntity entity:employeeEntities){
            System.out.println("entity = " + entity);
        }
    }
}
