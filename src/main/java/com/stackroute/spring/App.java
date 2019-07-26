package com.stackroute.spring;

import com.stackroute.spring.domain.Manager;
import com.stackroute.spring.domain.Surveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Surveyor surveyor = context.getBean("surveyor", Surveyor.class);
        System.out.println(surveyor);
        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager);


        Manager manager2 = (Manager) context.getBean("manager");
        System.out.println(manager2);
        System.out.println(manager==manager2);
    }
}
