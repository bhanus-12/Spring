<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC 2</title>
</head>
<body>
<h1>Hello from Spring MVC</h1>
<%
Integer id=(Integer)request.getAttribute("id");
String name=(String)request.getAttribute("name");
Integer Salary=(Integer)request.getAttribute("Salary");
%>

ID: ${id}
Name:${name}
Salary:${salary}
</body>
</html>