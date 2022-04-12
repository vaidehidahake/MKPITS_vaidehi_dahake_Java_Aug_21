package com.example.springex17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springex17Application {
    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("bean.xml");
        Employee eobj = appcont.getBean("emp",Employee.class);
        System.out.println(eobj.getId());

        Student sobj = appcont.getBean("stud",Student.class);
        System.out.println(sobj.getId());
        System.out.println(sobj.getName());
        sobj.printThrowException();
    }

}
