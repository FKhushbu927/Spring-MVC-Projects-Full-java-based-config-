<%--
  Created by IntelliJ IDEA.
  User: khushboo
  Date: 11/5/2020
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/save-login-form" modelAttribute="login">
    <table>
        <tr>
            <td>User Name:</td>
            <td><form:input path="userName" /></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><form:input path="password"/></td>
        </tr>

    </table>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
