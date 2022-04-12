<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="regprocess.jsp">
    <table>
        <tr>
    <td>name</td>
        <td><input type="text" name="name"></td>
        </tr>
        <tr>
    <td>password</td>
            <td><input type="password" name="pass"></td>
        </tr>
        <td>city</td>
        <td><select name="city">
        <option>Select</option>
       <option>Nagpur</option>
       <option>Pune</option>
       <option>Hyderabad</option></select></td>
        </tr>

        <tr>
            <td>Date</td>
            <td><input type="date" name="dob"></td>
        </tr>
        <tr>
            <td>Email Id</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Mobile Number</td>
            <td><input type="text" name="num"></td>
        </tr>
        <tr>

            <td><input type="submit" name="email"></td>
        </tr>


    </table>

</form>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>