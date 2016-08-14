/**
 * 
 */


function loadquiz() {
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (xhttp.readyState == 4 && xhttp.status == 200) {
	    	document.getElementById("rightdiv").innerHTML = xhttp.responseText;
	    }
	  };
	  xhttp.open("GET", "startquiz", true);
	  xhttp.send();
	}

function backtolanding(){
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange =function(){
		if (xhttp.readyState == 4 && xhttp.status == 200) {
	    	document.getElementById("rightdiv").innerHTML = xhttp.responseText;
	    	rightreport();
	    }
		
	};
	xhttp.open("GET","backtolanding",true);
	xhttp.send();
	
	
}
function createUser(){
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange =function(){
		if (xhttp.readyState == 4 && xhttp.status == 200) {
	    	document.getElementById("rightdiv").innerHTML = xhttp.responseText;
	    	
	    }
		
	};
	xhttp.open("GET","registerpage",true);
	xhttp.send();
}

function rightreport(){
	var article="<br/>A starter "+
	"(also self starter, self, or starter motor) is an electric motor, pneumatic motor, hydraulic motor, an internal-combustion engine in case of very large engines or other device used for rotating an internal-combustion engine so as to initiate the engine's operation under its own power.Internal-combustion engines are feedback systems, which once started rely on the inertia from each cycle to initiate the next cycle. In a four-stroke engine, the third stroke releases energy from the fuel, powering the fourth (exhaust) stroke and also the first two (intake, compression) strokes of the next cycle, as well as powering the engine's external load. To start the first cycle at the beginning of any particular session, the first two strokes must be powered in some other way than from the engine itself. The starter motor is used for this purpose and is not required once the engine starts running and its feedback loop becomes self-sustaining."+
	"<a  href="+"https://en.wikipedia.org/wiki/Starter_(engine)"+" >Read"+" More</a>";
	var doc = document.getElementById('iframe').contentWindow.document;
	doc.open();
	doc.write(article);
	doc.close();
	}

function login(){
	document.getElementById("form-login-id").submit();
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (xhttp.readyState == 4 && xhttp.status == 200) {
	    	
	    	document.getElementById("rightdiv").innerHTML = xhttp.responseText;
	    }
	  };
	  xhttp.open("POST", "login", true);
	  xhttp.send();
}




