<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
<style type="text/css">
div {
	font-family: Tahoma, Verdana, Segoe, sans-serif;
	padding: 10px;
}

.container {
	display: flex;
}

.flex-item {
	width: 50%;
	flex-grow: 1;
}

.right-item {
	width: 50%;
	flex-grow: 1;
}
</style>
</head>
<body>
	Welcome ${sessionScope.adminlogin.userName }
	<a href="manageadmin">Manage Admin</a><a href="adminlogout">Logout</a><br/>
	<div class="container">
		<div class="fixed">
			
			<center>
				<h3>Manage Questions</h3>
				<table>
					<form:form modelAttribute="addQuestion" action="addquestion"
						method="post">
						<tr>
							<td>Add new question</td>
							<td><input name="question" type="text" required /></td>
						</tr>
						<tr>
							<td>Add question's answer</td>
							<td><input name="realAnswer" type="text" required/></td>
						</tr>

						<input type="hidden" name="adminID"
							value="${sessionScope.adminlogin.id }">
						<tr>
							<td colspan="2"><center>
									<button type="submit">Add</button>
								</center></td>
						</tr>

					</form:form>
				</table>
			</center>
		</div>

		
		<div class="right-item">
			<center>
				<h3>Questions</h3>
				<table border="1">
						<tr><th>Q_ID</th><th>Question</th><th>answer</th></tr>
				<c:forEach var="ques" items="${qlist}">
					
						<tr> 
							<td>${ques.questionID }</td><td>${ques.question } </td><td>${ques.realAnswer }</td>
						</tr>
					

				</c:forEach>
				</table>
			</center>
		</div>
	</div>
</body>
</html>