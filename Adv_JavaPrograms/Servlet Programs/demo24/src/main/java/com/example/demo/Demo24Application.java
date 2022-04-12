package com.example.demo;

import com.example.demo.dao.Studdaoimpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class Demo24Application {

    public static void main(String[] args) {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");

        Studdaoimpl template = ctx.getBean("Stddao", Studdaoimpl.class);
        stud ob=new stud();
//        ob.setId(5);
//        ob.setName("divya");
//        ob.setAddr("varanasi");
//        template.insert(ob);
//        ob.setId(23);
//ob.setAddr("nanded");
//template.update(ob);
        ob.setId(5);
        template.delete(ob);



    }

}
