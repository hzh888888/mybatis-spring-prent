package complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    //Main方法

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_complex.xml");
        UserServiceImpl userService=context.getBean("userService",UserServiceImpl.class);
        userService.update();
    }
}
