package org.controller.idea;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.idea.Admin;
import org.model.idea.Questions;
import org.service.idea.AdminServices;
import org.service.idea.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@Autowired
	AdminServices adminServices;
	@Autowired
	QuestionServices questionServices;
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String getAdminPage(){
		
		return "admin";
	}
	
	@RequestMapping(value="/createadmin",method=RequestMethod.POST)
	public String createAdmin(@ModelAttribute("createAdmin") Admin admin,HttpServletRequest request) throws Exception{
		adminServices.createAdmin(admin);
		List<Questions> qlist=questionServices.displayQuestions();
		request.setAttribute("qlist", qlist);
		return "dashboard";
	}
	@RequestMapping(value="/adminlogin",method=RequestMethod.POST)
	public String adminLogin(@RequestParam String userName,@RequestParam String password,HttpServletRequest request) {
		Admin admin=adminServices.adminLogin(userName, password);
		request.getSession().setAttribute("adminlogin", admin);
		List<Questions> qlist=questionServices.displayQuestions();
		request.setAttribute("qlist", qlist);
		return "dashboard";
	}
	
	@RequestMapping(value="/adminlogout",method=RequestMethod.GET)
	public String adminLogout(HttpSession session){
		session.invalidate();
		return "admin";
	}
	
}
