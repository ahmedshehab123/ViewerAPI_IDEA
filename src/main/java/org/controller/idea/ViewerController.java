package org.controller.idea;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewerController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getSarted(){
		
		return "landing";
	}
	@RequestMapping(value="/backtolanding",method=RequestMethod.GET)
	public String backtolanding(){
		
		return "rigtside";
	}
	
	
}
