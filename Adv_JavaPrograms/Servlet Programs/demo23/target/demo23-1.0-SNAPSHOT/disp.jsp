<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<jsp:useBean id="user" class="com.example.demo23.UserBean"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<h1>Welcome User <jsp:getProperty name="user" property="uname"></jsp:getProperty></h1>
</body>
</html>