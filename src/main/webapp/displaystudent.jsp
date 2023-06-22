<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>PHNO</th>
			<th>EMAIL</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="student" items="${list}">
			<tr>
				<td>${student.getId()}</td>
				<td>${student.getName()}</td>
				<td>${student.getAge()}</td>
				<td>${student.getPhno()}</td>
				<td>${student.getEmail()}</td>
				<td><a href="getbyidstudent?id=${student.getId()}">Edit</a></td>
				<td><a href="deletestudent?id=${student.getId()}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>