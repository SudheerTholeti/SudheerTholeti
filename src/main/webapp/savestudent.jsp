<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savestudent" modelAttribute="student">
		NAME: <form:input path="name"/>
		AGE: <form:input path="age"/>
		PHNO: <form:input path="phno"/>
		EMAIL: <form:input path="email"/>
		<form:button>SAVE</form:button>
	</form:form>
</body>
</html>