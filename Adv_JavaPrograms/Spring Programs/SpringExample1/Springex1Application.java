package com.example.springex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Springex1Application {

    public static void main(String[] args) {

        ApplicationContext appcontext=new ClassPathXmlApplicationContext("templates/bean.xml");//when application starts it first
        //goes to bean.xml file where he found Employee class,and IOC container will instatiate the object of Employee class
        appcontext.getBean("prod");//it will return object type from IOC container
        product prodobj = (product) appcontext.getBean("prod");
        prodobj.displayProductDetails();
    }

}
