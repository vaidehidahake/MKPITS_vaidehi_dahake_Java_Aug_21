<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% int a=5,b=3;
%>
<% if(a>b)
{
    %>
<font color="red" size="12">a is greater</font>
<%
    }
    else
    {
%>
<font color="red" size="12">b is greater</font>
<%
}
    %>
<%-- loop--%>
<%
for(int i=0;i<=10;i++)
{
    %>
<font color="red" size="12">b is greater</font><br>
<%

}
%>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>