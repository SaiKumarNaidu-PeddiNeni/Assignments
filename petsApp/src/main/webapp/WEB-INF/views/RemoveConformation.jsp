<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<div align="center">
		<h3 style="color: red">${errorMessage}</h3>
		<form:form action="./remove" method="Post" modelAttribute="user">
			<style type="text/css">
.error {
	color: red
}
</style>

			<label for="username" class="field">Enter the userName:<span
				class="mandatory">*</span>
			</label>
			
			<form:input path="userName" />
			<br>
			
			<label for="password" class="field">Enter the password:<span
				class="mandatory">*</span>
			</label>
			
			<form:password path="password" />
			<form:errors path="password" cssClass="error"></form:errors>
			<br>
			
			<input type="submit" id="button1" value="Delete">
			
			<input type ="reset" id="button1" value="reset">

		</form:form>

	</div>

</body>
</html>