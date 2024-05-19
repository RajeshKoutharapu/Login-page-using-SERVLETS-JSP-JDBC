<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</title>
</head>
<body>
<% response.setHeader("Cache-Control","no-cache,no-store,must-revadate");  %>
  <form action="selection">
   <center>
   UserID:<input class="a5"type="text" name="checkname" placeholder="Userid....."><br>
   
   <style>
   .a5{
    margin-left:15px;
    font-size:30px;
   
   
   }
   .a3{
     margin-left:1px;
     margin-top:30px;
   }
   </style>
  Password:<input class="a3" type="text"name="checkpass" placeholder="Password...">
  <br>

  </a>
  <br>
  <button class="a1">Login</button><br>
  <style>
  .a1{
  font-size:30px;
    margin-top:20px;
    height:50px;
    width:130px
    
  
  }
  </style>
  </form>
  <center>
  <a href="register.jsp">
 
     Don't have Register?
  </a>

  </center>
  <style>
    input{
    margin-top: 10px;
    width:400px
   
 

    
    
     
}
button{
    margin-top: 20px;
    margin-left:40px;
    
}
a{
  margin-left: 40px;
  
  
}
.a5{
height:50px;
margin-top:180px;
text-size: 400px;

}
.a3{
height:50px;
font-size:30px;
}




  </style>


</body>
</html>