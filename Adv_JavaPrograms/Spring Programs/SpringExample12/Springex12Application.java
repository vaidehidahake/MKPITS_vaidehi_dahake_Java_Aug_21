package com.example.springex12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springex12Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("templates/bean.xml");
        Employee baseobj = (Employee) appcont.getBean("base");
        System.out.println(baseobj);

        Employee eobj1 = (Employee) appcont.getBean("eob");
        System.out.println(eobj1);
    }

}
