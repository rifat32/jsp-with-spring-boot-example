<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contact list</title>
</head>
<body>
<h1>My Contact List</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${contacts}" var="contact" >
<tr>
    <td>${contact.name}</td>
    <td>${contact.email}</td>
    <td>${contact.country}</td>
</tr>
    </c:forEach>
</table>
</body>
</html>