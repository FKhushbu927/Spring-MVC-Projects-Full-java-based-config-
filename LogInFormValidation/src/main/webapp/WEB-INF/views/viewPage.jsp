<%--
  Created by IntelliJ IDEA.
  User: khushboo
  Date: 11/9/2020
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/save-login" modelAttribute="emp">
    <table>
        <tr>
            User Name(*):<form:input path="userName" />
            <form:errors path="userName" cssClass="error"/>
        </tr>
        <br><br>
        <tr>
            Password(*):
            <form:input path="password"/>
            <form:errors path="password" cssClass="error"/>
        </tr>

    </table>
    <input type="submit" value="Submit" />

</form:form>
</body>
</html>
