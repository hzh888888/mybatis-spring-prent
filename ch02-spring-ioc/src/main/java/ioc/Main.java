package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_complex.xml");

        SqlSessionFactorCreator sqlSessionFactorCreator = context.getBean("SqlSessionFactorCreator", SqlSessionFactorCreator.class);
        System.out.println( sqlSessionFactorCreator.create());
        System.out.println(sqlSessionFactorCreator);
    }
}
