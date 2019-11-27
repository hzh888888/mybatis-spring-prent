package com.seriver;

import com.serivce.DeptSerivce;
import com.serivce.EmployeeSerivce;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:serivcer-spring.xml")
public class DeptSerivceTest {

    @Autowired
    private DeptSerivce deptSerivce;

    @Autowired
    public void Test(){
        deptSerivce.del(0);
    }
}
