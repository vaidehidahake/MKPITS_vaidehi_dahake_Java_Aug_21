package com.example.demo9;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import static java.lang.System.out;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World! vaidehi";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        int a=4;
        PrintWriter out = response.getWriter();
        String name=request.getParameter("name");
        request.setAttribute("num1",a);

        response.sendRedirect("Servlet2");
        RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
        rd.forward(request, response);


//try {

    //if (name.equals("vaidehi")) {
      //  RequestDispatcher rd = request.getRequestDispatcher("suc.html");
        //rd.forward(request, response);
    //} else {
      //  RequestDispatcher rd = request.getRequestDispatcher("err.html");
        //rd.forward(request, response);
    //}
//}catch (Exception e){}


        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}