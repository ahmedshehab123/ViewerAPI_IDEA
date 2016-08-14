<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>Login first or Sign Up or click back to check motor </b>
	<button onclick="backtolanding()">Back</button>
	<form:form  action="login" method="post" >
		<table>

			<tr>
				<td>Email</td>
				<td><input name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password"></td>
			</tr>
			<tr>
				<td><button type="submit">Log in</button></td>
			</tr>
		</table>
	</form:form>
	<b>Sign Up</b>
	
	<form:form  modelAttribute="signup" method="post" action="createuser">
		<table>

			<tr>
				<td>Email</td>
				<td><input name="email" type="text"></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input name="userName" type="text"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" type="text"></td>
			</tr>
			<tr>
				<td><button type="submit" >  Log in</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>