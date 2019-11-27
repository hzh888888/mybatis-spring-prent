package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_basic.xml");
        DbConfig dbConfig=context.getBean("dbConfig",DbConfig.class);
        UserInfo userInfo=context.getBean("userInfo",UserInfo.class);
//     System.out.println(dbConfig);
        System.out.println("userInfo = " + userInfo);
    }
}
