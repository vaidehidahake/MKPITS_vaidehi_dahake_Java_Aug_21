package com.example.springex4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springex4Application {

    public static void main(String[] args) {
        ApplicationContext appcontext=new ClassPathXmlApplicationContext("/templates/bean.xml");
        Employee empobj = (Employee) appcontext.getBean("emp");
        System.out.println(empobj.getId());
        System.out.println(empobj.getName());
        empobj.display();

        Account accobj = (Account) appcontext.getBean("acc");
        accobj.trans();
    }

}
