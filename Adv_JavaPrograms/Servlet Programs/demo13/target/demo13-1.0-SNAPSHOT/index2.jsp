<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%-- loop--%>

<% int a=5,b=3;
    String col[]={"red","blue","green","yellow","purple","black","pink","grey","lightgreen","orange"};
%>



<%
for(int i=0;i<10;i++)
{
%>
<font color="<%=""+col[i]%>>" size="12">b is greater</font><br>
<%

    }
%>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>