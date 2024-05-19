<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% response.setHeader("Cache-Control","no-cache,no-store,must-revadate");  %>
<center>
<form action="insersion">
    <input type="text" name="name" placeholder="enter user name">
    <br>
    <input type="text" name="password" placeholder="Password"><br>
<input type="text" name="Conformpass" placeholder="conform password"><br>
<button>Submit</button>
<style>
        input{
    margin-top: 10px;
}
button{
    margin-top: 20px;
}
</style>
</form>
</body>
</html>