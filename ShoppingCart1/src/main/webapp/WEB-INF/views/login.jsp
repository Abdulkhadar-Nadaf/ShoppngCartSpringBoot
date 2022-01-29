<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@include file="Includes/header.jsp" %>
</head>
<body>
	<h1>Login Page</h1>
	<spring:form action="login" method="post" modelAttribute="users">
	Name:<spring:input path="name"/>
	Email:<spring:input path="email" id="email" />
	Password:<spring:input path="password" id="password" />

		<input type="submit" name="Submit ">
	</spring:form>

<%@include file="Includes/footer.jsp" %>
</body>
</html>