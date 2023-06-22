<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="updatestudent" modelAttribute="student">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="id" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>NAME</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>AGE</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>PHNO</td>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td> <form:button>Update</form:button> </td>
			</tr>
		</table>
	</form:form>
</body>
</html>