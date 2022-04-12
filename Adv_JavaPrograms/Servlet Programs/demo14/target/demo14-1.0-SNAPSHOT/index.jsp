<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="log.jsp">
    <table>
        <tr>
            <td>name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="pass"></td>
        </tr>
        <tr>
            <td><input type="submit"></td>
        </tr>
        <tr>
    <td><a href=registration.jsp>Create new account</a></td>
        </tr>
    </table>
</form>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>