<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% response.setHeader("Cache-Control","no-cache,no-store,must-revadate"); %>
<form action="back">
<center>
You Have Registered succesfully
<a href ="login.jsp"> back to login</a>
</center>
</form>
</body>
</html>