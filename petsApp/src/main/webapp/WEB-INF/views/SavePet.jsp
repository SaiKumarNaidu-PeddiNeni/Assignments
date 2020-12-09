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
		<form:form action="./savePet" method="Post" modelAttribute="pet">
			<style type="text/css">
.error {
	color: red
}
</style>

			<label for="petName" class="field">Enter the Pet Name:<span
				class="mandatory">*</span>
			</label>
			
			<form:input path="petName" />
			<br><br>
			
			<label for="place" class="field">Enter the Place:<span
				class="mandatory">*</span>
			</label>
			
			<form:input path="place" />
			<br><br>
			
			<label for="age" class="field">Enter the age:<span
				class="mandatory">*</span>
			</label>
			
			<form:input path="age" />
			<br><br>
			
			<input type="submit" id="button1" value="Save">
			
			<input type ="reset" id="button1" value="reset">

		</form:form>

	</div>

</body>
</html>