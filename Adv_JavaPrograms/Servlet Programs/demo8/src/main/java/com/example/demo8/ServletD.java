package com.example.demo8;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet(name = "ServletD", value = "/ServletD")
public class ServletD extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("name");
        String pass=request.getParameter("password");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/vaidehi","root","root");
            Statement stmt=con.createStatement();

            out.println("successfully connected");
            //String qr=("insert into userlog values ('"+name+"','"+pass+"')");
            String qr=("delete form userlog where pass="" ");
            stmt.executeUpdate(qr);
            out.println("data insert");

        }catch(Exception e){
            out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
