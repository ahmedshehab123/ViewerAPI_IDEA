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
<c:if test="${sessionScope.userlogin.id !=null }"> 
<a href="startquiz">Start Quiz</a>
</c:if>
<c:if test="${sessionScope.userlogin.id ==null }"> 
<button onclick="createUser()">Start Quiz</button>
</c:if>


<div >
<iframe style="background: transparent;" id="iframe" width="100%" height="300" ></iframe>
<script type="text/javascript">
var article="<br/>A starter "+
"(also self starter, self, or starter motor) is an electric motor, pneumatic motor, hydraulic motor, an internal-combustion engine in case of very large engines or other device used for rotating an internal-combustion engine so as to initiate the engine's operation under its own power.Internal-combustion engines are feedback systems, which once started rely on the inertia from each cycle to initiate the next cycle. In a four-stroke engine, the third stroke releases energy from the fuel, powering the fourth (exhaust) stroke and also the first two (intake, compression) strokes of the next cycle, as well as powering the engine's external load. To start the first cycle at the beginning of any particular session, the first two strokes must be powered in some other way than from the engine itself. The starter motor is used for this purpose and is not required once the engine starts running and its feedback loop becomes self-sustaining."+
"<a  href="+"https://en.wikipedia.org/wiki/Starter_(engine)"+" >Read"+" More</a>";
var doc = document.getElementById('iframe').contentWindow.document;
doc.open();
doc.write(article);
doc.close();
</script>


</div>
<iframe width="354" height="280" src="https://www.youtube.com/embed/_f6kM1e1fBA" frameborder="0" allowfullscreen></iframe>
</div>
</div>
</body>
</html>

