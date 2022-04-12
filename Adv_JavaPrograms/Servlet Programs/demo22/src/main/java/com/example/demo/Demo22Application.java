package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Demo22Application {

    public static  void main(String[] args)
    {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("/templates/Bean1.xml");


            try{
                DriverManagerDataSource source = ctx.getBean("datasource", DriverManagerDataSource.class);
                Connection con=source.getConnection();
//                Class.forName("com.mysql.jdbc.Driver");
               // System.out.println("driver loaded");
//                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vaidehi","root","root");
//                Statement stmt=con.createStatement();
//                String qr=("insert into students(id,name,job)values(2,'dolly','java'),(3,'Ameya','sql'),(4,'chotu','pogo');");
//                stmt.executeUpdate(qr);
//                System.out.println("Inserted........");
            }catch(Exception e){
                System.out.println(e);
            }
        }
        }



