<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
</head>
<body>

<br/><br/><br/>
	<center>
   ${nameerror}
		<form action="adminlogin" method="post">
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td colspan="2"><center><button>submit</button></center></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>