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
	<div align="center">
		<form:form action="saveAdmin" method="post"
			modelAttribute="admin">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Add Admin</h2></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password" cssClass="error"></form:errors></td>
				</tr>



				<tr>
					<td colspan="2" align="center">
						<button type="submit">Submit</button>
						<button type="reset">Reset</button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>