<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
welcome to login page
<%
    String name = request.getParameter("name");
    String password = request.getParameter("pass");



%>
<%
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vaidehi","root","root");
        out.println("databse connected");
%>
<%--<font color="green" size="5">Account creates successfully</font> <br>--%>
<%
    PreparedStatement ps=con.prepareStatement("select name,password from regtable where name=? and password=?");
    ps.setString(1,name);
    ps.setString(2,password);
    ResultSet rs = ps.executeQuery();

    if(rs.next())
    {
        session.setAttribute("user",name);
        response.sendRedirect("dashboard.jsp");

        //out.println("success");
    }
    else
    {
        response.sendRedirect("error.jsp");
        //out.println("fail");
    }
%>
<%--<font color="blue" size="5">Record inserted successfully</font>--%>
<%
    }catch(Exception ee) {
        out.println(ee.toString());
    } %>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>