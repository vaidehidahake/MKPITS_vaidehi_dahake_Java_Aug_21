<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("pass");
    String city = request.getParameter("city");
    String dob = request.getParameter("dob");
    String email = request.getParameter("email");
    String num = request.getParameter("num");




%>
<%

    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vaidehi","root","root");
%>
<font color="green" size="5">Successfully Database Connected</font> <br>

<%
    //out.println("Successfully Database Connected");
    Statement stmt=con.createStatement();
    String query=("insert into regtable values ('"+name+"','"+password+"','"+city+"','"+dob+"','"+email+"','"+num+"')");
    stmt.executeUpdate(query);
%>
<font color="red" size="5">Record inserted successfully</font>

<%
        //out.println("Record inserted Successfully");
    }catch(Exception ee) {

        out.println(ee.toString());

    } %>

<br/>

<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>