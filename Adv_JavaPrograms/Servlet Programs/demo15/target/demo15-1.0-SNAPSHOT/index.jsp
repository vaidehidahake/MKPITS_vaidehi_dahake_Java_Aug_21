<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@page errorPage="error1.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    int c=5/0;
    %>
%>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>