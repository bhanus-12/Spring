<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bhanu.springcoreadvanced.springmvc.controllers.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> employees=(List<Employee>)request.getAttribute("employees");


for(Employee emp:employees){
	out.println(emp.getId());
	out.println(emp.getName());
	out.println(emp.getSalary());
	
}
out.println("\n");
out.println("employee3");
Employee emp3=(Employee)request.getAttribute("employee3");
out.println(emp3.toString());
%>
</body>
</html>