<%--
  Created by IntelliJ IDEA.
  User: khushboo
  Date: 11/5/2020
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/save-registration-form" modelAttribute="registration">
    <table>
        <tr>
            <td>User Name:</td>
            <td><form:input path="userName" /></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><form:input path="password"/></td>
        </tr>

        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName" /></td>
        </tr>

        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName" /></td>
        </tr>

        <tr>
            <td>E-Mail:</td>
            <td><form:input path="email" /></td>
        </tr>

        <tr>
            <td>Address:</td>
            <td><form:input path="address" /></td>
        </tr>

        <tr>
            <td>Phone Number:</td>
            <td><form:input path="phone" /></td>
        </tr>
    </table>
        <input type="submit" value="Submit" />

</form:form>
</body>
</html>
