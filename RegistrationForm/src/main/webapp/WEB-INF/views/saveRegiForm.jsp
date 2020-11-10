<%--
  Created by IntelliJ IDEA.
  User: khushboo
  Date: 11/5/2020
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<p>User Name:${registrationForm.userName}</p>
<br>
<p>Password:${registrationForm.password}</p>
<br>
<p>First Name:${registrationForm.firstName}</p>
<br>
<p>Last Name:${registrationForm.lastName}</p>
<br>
<p>E-Mail:${registrationForm.email}</p>
<br>
<p>Address:${registrationForm.address}</p>
<br>
<p>Phone Number:${registrationForm.phone}</p>
<br>

</body>
</html>
