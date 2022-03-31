<%--
  Created by IntelliJ IDEA.
  User: izzybella01
  Date: 3/31/22
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Login</title>
    </head>
    <body>
    <%@include file="partials/navbar.jsp"%>
        <form method="POST" action="${pageContext.request.contextPath}/login.jsp">
            <label for="username">Username</label>
            <input id="username" name="username" type="text">
            <br>

            <label for="password">Password</label>
            <input id="password" name="password" type="password">
            <br>

            <input type="submit">
        </form>

        <c:if test="${param.username.equals('admin') && param.password.equals('password')}">
            <c:redirect url="/profile.jsp"/>
        </c:if>



    </body>
</html>
