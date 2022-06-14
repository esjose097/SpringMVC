<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
        <!--Aquí es donde se reciben los datos utilizando la clave que fué declarada anteriormente en el "HelloController"-->
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		out.println("ID: " + id);
		out.println("Name: " + name);
		out.println("salary: " + salary);
	%>
	<br /> 
        <!--Esto es un ejemplo de como poner los datos de una manera diferente utilizando "JSP Expression Language-->
	Id:
	<b>${id}</b> 
	 Name
	<b>${id}</b> 
	Salary:
	<b>${id}</b>
</body>
</html>