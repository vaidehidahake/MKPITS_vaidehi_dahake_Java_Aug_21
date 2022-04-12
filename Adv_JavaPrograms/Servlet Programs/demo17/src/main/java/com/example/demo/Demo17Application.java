package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo17Application {

    public static void main(String[] args)
    {
       ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/Bean.xml");
        Emp em = (Emp) appcont.getBean("Em");
        em.display();
    }

}
