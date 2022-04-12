<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>ERROR PAGE
</h1>
<%--<%=exception%>--%>
<%=exception.getMessage()%>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>