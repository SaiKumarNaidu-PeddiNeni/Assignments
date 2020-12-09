<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h3 style="color: red">${errorMessage}</h3>
		<form:form action="./addpet" method="Post" modelAttribute="pet">
			<style type="text/css">
.error {
	color: red
}
</style>

			<label for="petName" class="field">Enter the Pet Name:<span
				class="mandatory">*</span>
			</label>
			
			<form:input path="petName" />
			<br>
			
			<label for="place" class="field">Enter the Place:<span
				class="mandatory">*</span>
			</label>
			
			<form:password path="place" />
			
			<label for="age" class="field">Enter the Age:<span
				class="mandatory">*</span>
			</label>
			
			<form:password path="age" />
			
			<form:errors path="password" cssClass="error"></form:errors>
			<br>
			
			<input type="submit" id="button1" value="Add Pet">
			
			<input type ="reset" id="button1" value="reset">

		</form:form>

	</div>

</body>
</html>