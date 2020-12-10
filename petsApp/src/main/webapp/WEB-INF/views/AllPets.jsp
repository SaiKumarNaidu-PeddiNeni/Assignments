<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
All Pets 
<h5>Id&emsp;Name&emsp;age&emsp;place</h5> 
	<table>
		<tbody>
			<c:forEach items="${Pets}" var="pet">
				<tr>
					<td>${pet.petId}</td>
					<td>${pet.petName}</td>
					<td>${pet.age}</td>
					<td>${pet.place}</td>
					<td>
					<c:if test="${pet.owner.userId==null }">
					<button type="button" >Buy</button>
					</c:if>
					<c:if test="${pet.owner.userId!=null }">
					<button type="button" disabled>sold</button>
					</c:if>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>