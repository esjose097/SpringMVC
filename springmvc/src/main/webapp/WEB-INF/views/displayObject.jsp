<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Object Details</title>
</head>
<body>
    <!--Esta es la pagina donde se desplega el objeto employee del "ObjectController"-->
    <%=request.getAttribute("employee")%>
</body>
</html>