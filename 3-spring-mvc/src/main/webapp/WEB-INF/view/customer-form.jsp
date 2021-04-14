<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: xtenzQ
  Date: 4/10/2021
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error { color: red; }
    </style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName" />
    <br><br>
    Last name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error" />
    <br><br>
    Free passes: <form:input path="freePasses" />
    <form:errors path="freePasses" cssClass="error" />
    <br><br>
    Postal code: <form:input path="postalCode" />
    <form:errors path="postalCode" cssClass="error" />
    <br><br>
    Course code: <form:input path="courseCode" />
    <form:errors path="courseCode" cssClass="error" />
    <br><br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
