package com;

import com.service.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptServiceImplTest {

    @Autowired
    private ApplicationContext context;
    @Test
    public void test(){
        DeptServiceImpl service=context.getBean(DeptServiceImpl.class);
        service.txDemo();
    }
}
