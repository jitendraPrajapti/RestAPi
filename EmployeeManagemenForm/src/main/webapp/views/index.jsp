<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Save Employee</h2>
	<form:form action="AddEmp" modelAttribute="employee" method="post">
		<table>
			<tr>
				<td>Name::
				<td><form:input path="ename" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="Email" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><form:input path="Mobile" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><form:input path="Role" /></td>
			</tr>
		</table>


	</form:form>
</body>
</html>