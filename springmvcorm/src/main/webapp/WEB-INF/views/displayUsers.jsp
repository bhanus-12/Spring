<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>id</th>
<th>name</th>
<th>email</th><tr>
<c:forEach items="${users}" var="user">
<tr><td><cout> ${user.id}</cout></td>
<td><cout> ${user.name}</cout></td>
<td><cout> ${user.email}</cout></td>
</c:forEach>
</table>
</body>
</html>