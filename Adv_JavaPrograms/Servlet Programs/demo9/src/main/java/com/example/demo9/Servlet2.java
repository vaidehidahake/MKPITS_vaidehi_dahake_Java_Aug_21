package com.example.demo9;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // PrintWriter out = response.getWriter();
        //        out.println("serv 2");
        //        out.println(request.getParameter("name"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
                out.println("serv 2");
                out.println(request.getParameter("name"));
                out.println(request.getAttribute("num1"));

    }
}
