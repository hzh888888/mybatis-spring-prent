package com;

import com.config.AppConfig;
import com.entity.Employee;
import com.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author cj
 * @date 2019/11/6
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class DeptServiceImplTest {

    @Autowired
    private EmployeeService employeeService;
    @Test
    public void getAll() {
        
        List<Employee> result = employeeService.getAll(1, 3);
        for (Employee employeeEntity : result) {
            System.out.println("-----debug: employeeEntity = " + employeeEntity);
        }
    }

    @Test
    public void txDemo() {

        employeeService.txDemo(27,"李四");
    }
}