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
	    }
		
	};
	xhttp.open("GET","backtolanding",true);
	xhttp.send();
	
	
}