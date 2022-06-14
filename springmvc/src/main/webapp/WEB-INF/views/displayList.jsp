<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.bharath.spring.springmvc.dto.Employee,java.util.List"%><!--Recuerda que siempre vas a importar las dependencias que necesitaras-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!--Se despliega utilizando una estructura de repetición for-->
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
		for (Employee e : employees) {
			out.println(e.getId());
			out.println(e.getName());
		}
	%>
</body>
</html>