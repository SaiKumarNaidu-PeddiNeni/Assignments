<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
<link href="${pageContext.request.contextPath}/resources/css/home.css"
    rel="stylesheet">
</head>
<body>
<div align="Left">
    User:${user.userName}
    <br> ${user.userId}
</div>

<div align="Right">
<div class="topnav">

  <a  href="./Home1">Home</a> 
  <a href="mypets.jsp">My Pets</a>
  <a href="./AddPet1">Add Pet </a>
  <a href="./Logout1">Logout</a>
</div>
</div>


    <div align="center"><h1>Welcome to PETAPP: ${user.userName}</h1></div>
    <center>    
    <!-- <style type="text/css"> -->

<!-- </style> -->
    
</center>

 

</body>
</html>