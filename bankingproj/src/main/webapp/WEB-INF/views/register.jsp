<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<style type="text/css">
.error {
	color: red
}
</style>

</head>
<body>

	<div align="center">
	

		<form:form action="savecustomer" method="post"
			modelAttribute="customer">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>AddCustomer</h2></td>
				</tr>
				
				<tr>
					<td>Customer Id</td>
					<td><form:input path="customerId" /></td>
					<td><form:errors path="customerId" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>Full Name</td>
					<td><form:input path="fullName" /></td>
					<td><form:errors path="fullName" cssClass="error" ></form:errors></td>
				</tr>
				<tr>
					<td>Sex</td>
					<td><form:input path="sex" /></td>
					<td><form:errors path="sex" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>address</td>
					<td><form:input path="address" /></td>
					<td><form:errors path="address" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>phoneNo</td>
					<td><form:input path="phoneNo" /></td>
					<td><form:errors path="phoneNo" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>aadhar</td>
					<td><form:input path="aadhar" /></td>
					<td><form:errors path="aadhar" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>panCard</td>
					<td><form:input path="panCard" /></td>
					<td><form:errors path="panCard" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>dOB</td>
					<td><form:input path="dOB" /></td>
					<td><form:errors path="dOB" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
					<td>rationCard</td>
					<td><form:input path="rationCard" /></td>
					<td><form:errors path="rationCard" cssClass="error"></form:errors></td>
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