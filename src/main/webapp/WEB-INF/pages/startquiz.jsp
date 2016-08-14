<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>3D-Knowledge</title>
<link rel="stylesheet"  href="/ViewerAPI/resources/css/styles.css" type="text/css" >
<script type="text/javascript" src="/ViewerAPI/resources/scripts/sketchfab-viewer-1.0.0.js"></script>
<script type="text/javascript" src="/ViewerAPI/resources/scripts/quizscript.js"></script>

</head>
<body>
<div>
<c:if test="${sessionScope.userlogin.id!=null }">
<a href="logout">logout</a></c:if>
</div>
<div class="container">
<div class="fixed"><iframe width="100%" height="480" src="https://sketchfab.com/models/3b040c6fb47144ec89e7f40fc1c7ac3e/embed" frameborder="0" allowfullscreen mozallowfullscreen="true" webkitallowfullscreen="true" onmousewheel=""></iframe>
<p style="font-size: 13px; font-weight: normal; margin: 5px; color: #4A4A4A;">
    <a href="https://sketchfab.com/models/3b040c6fb47144ec89e7f40fc1c7ac3e?utm_medium=embed&utm_source=website&utm_campain=share-popup" target="_blank" style="font-weight: bold; color: #1CAAD9;">Startermotor</a>
    by <a href="https://sketchfab.com/jon.russell?utm_medium=embed&utm_source=website&utm_campain=share-popup" target="_blank" style="font-weight: bold; color: #1CAAD9;">jon.russell</a>
    on <a href="https://sketchfab.com?utm_medium=embed&utm_source=website&utm_campain=share-popup" target="_blank" style="font-weight: bold; color: #1CAAD9;">Sketchfab</a>
</p>
</div>
<div id="rightdiv" class="flex-item">
<h3>Quiz mode</h3>
<b>Answer this question to go to next one</b><br/><br/>
<b>(1)</b>Please select the starter motor.<br/><br/><br/><br/>
<button onclick="backtolanding()">Back</button>
</div>
</div>
</body>
</html>

