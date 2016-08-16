<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/><center>
${error }
	<form:form action="login" method="post">
		<table>

			<tr>
				<td>Email</td>
				<td><input name="email" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" type="password" required></td>
			</tr>
			<tr>
				<td><button type="submit">Log in</button></td>
			</tr>
		</table>
	</form:form>
	<b>Sign Up</b><br/>
     ${emailexist }
	<form:form modelAttribute="signup" method="post" action="createuser">
		<table>

			<tr>
				<td>Email</td>
				<td><input name="email" type="text" required></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input name="userName" type="text" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" type="password" required></td>
			</tr>
			<tr>
				<td><button type="submit">Log in</button></td>
			</tr>
		</table>
	</form:form>
	</center>
</body>
</html>