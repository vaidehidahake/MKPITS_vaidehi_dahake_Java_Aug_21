<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
welcome to login page
<c:set var="num" value="34"></c:set>
<c:out value="${num}"></c:out>
<c:if test="${num>33}">
<h1>number is greater</h1>
</c:if>
<c:forEach var="i" begin="1" end="20">
    <h1>hello</h1>
</c:forEach>
<c:set var="num1" value="120"></c:set>
<c:set var="num2" value="10"></c:set>
<%--<c:remove var="num2"></c:remove>--%>

<c:out value="${num1+num2}"></c:out>
<c:choose>
    <c:when test="${num1>20}">
    <h1>num1 greater than 20</h1>
    </c:when>
    <c:otherwise>
        <h1>num1 is not greater than 20</h1>
    </c:otherwise>
</c:choose>
<c:catch var="exob">
    <% int a=3/0;%>
    
</c:catch>
<c:out value="${exob}"></c:out>
</body>
</html>