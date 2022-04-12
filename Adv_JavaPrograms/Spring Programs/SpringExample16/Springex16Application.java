package com.example.springex16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Springex16Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("/templates/bean.xml");
        Employee eobj = appcont.getBean("emp",Employee.class);
        System.out.println(eobj.getId());
        eobj.setId(22);
        System.out.println(eobj.getId());
        Student sobj = appcont.getBean("stud",Student.class);
        System.out.println(sobj.getId());
        System.out.println(sobj.getName());

    }

}
