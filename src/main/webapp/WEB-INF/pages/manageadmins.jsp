<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Admins</title>
</head>
<body>

${nameerror }
	<center>
		<h4>Manage Admin Accounts</h4>
		Create Admin Account
		
		<form:form  action="createadmin" method="post">
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="userName" required/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required/></td>
				</tr>
				<tr>
					<td colspan="2"><center>
							<button>submit</button>
						</center></td>
				</tr>
			</table>
		</form:form>

	</center>
	<center>

		<table>
			<tr>
				<th>Username</th>
				<th>Password</th>
				<th>Manage</th>
			</tr>
			<c:forEach var="admin" items="${admins }">
				<tr>
					<td>${admin.userName }</td>
					<td>${admin.password }</td>
					<td>Delete</td>
				</tr>
			</c:forEach>
		</table>

	</center>


</body>
</html>