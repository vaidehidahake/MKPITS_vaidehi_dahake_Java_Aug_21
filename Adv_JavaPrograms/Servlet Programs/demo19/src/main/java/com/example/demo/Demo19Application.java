package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo19Application {

    public static void main(String[] args) {
       ApplicationContext appcont= new ClassPathXmlApplicationContext("/templates/Bean.xml");
        emp1 myob = (emp1) appcont.getBean("myob");
        myob.display();
        Account acc = (Account) appcont.getBean("aob");
        acc.trans();

    }

}
