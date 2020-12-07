<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- <form action="./one" method="post"> --%>

	<!-- 	Enter the UserId: <input type="text" name="userId"> -->
	<!-- 	Enter the Password: <input type="password" name="password"> -->
	<!-- 	Enter the UserName: <input type="text" name="userName"> -->

	<!-- 						<input type="submit" value="Login"> </form> -->
	





<div align="center">
<h3 style="color:red">${errorMessage}</h3>
	<form:form action="./login" method="Post" modelAttribute="user">
<style type="text/css">
.error{color: red}
</style>
        
		Enter the userId :<form:input path="userId" /><br>
		Enter the password:<form:password path="password" />
		<form:errors path="password" cssClass="error"></form:errors><br>
		<%-- 		Enter the userName:<form:input path="userName"/> --%>

		<input type="submit" value="Login">



	</form:form>


</div>

</body>
</html>