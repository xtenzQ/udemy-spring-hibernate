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
    <title>Customer Confirmation</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}<br>
Free passes: ${customer.freePasses}<br>
Postal code: ${customer.postalCode}<br>
Course code: ${customer.courseCode}
</body>
</html>
