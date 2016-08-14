<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div >
<c:if test="${sessionScope.userlogin.id !=null }"> 
<button onclick="loadquiz()">Start Quiz</button>
</c:if>
<c:if test="${sessionScope.userlogin.id ==null }"> 
<button onclick="createUser()">Start Quiz</button>
</c:if>
<iframe style="background: transparent;" id="iframe" width="100%" height="300" ></iframe>
<script type="text/javascript">

</script>
</div>
<iframe width="354" height="280" src="https://www.youtube.com/embed/_f6kM1e1fBA" frameborder="0" allowfullscreen></iframe>
</body>
</html>