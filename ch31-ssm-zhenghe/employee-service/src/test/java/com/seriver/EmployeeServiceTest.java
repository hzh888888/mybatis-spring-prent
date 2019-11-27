package com.seriver;

import com.entity.EmployeeEntity;
import com.serivce.EmployeeSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:serivcer-spring.xml")
public class EmployeeServiceTest {
    @Autowired
    private EmployeeSerivce employeeSerivce;

    @Test
    public void Test(){
        List<EmployeeEntity> employeeEntities=employeeSerivce.getAll1(1,2);
        for (EmployeeEntity entity :employeeEntities){
            System.out.println("entity = " + entity);
        }
    }
}
