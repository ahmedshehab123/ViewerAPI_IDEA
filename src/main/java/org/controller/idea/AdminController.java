package org.controller.idea;

import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.idea.Admin;
import org.model.idea.Questions;
import org.service.idea.AdminServices;
import org.service.idea.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String createAdmin(@RequestParam String userName,@RequestParam String password,HttpServletRequest request,ModelMap model) {
		Admin admin=null;
		try{
			admin= adminServices.checkExistAdmin(userName);
		 	
		}catch(NoResultException e){}
		if(admin==null){
			
		adminServices.createAdmin(userName,password);
		List<Admin> admins=adminServices.listAdmins();
		request.setAttribute("admins", admins);
		return "manageadmins";
		}
		else{
			model.addAttribute("existname", "Username already exist");
			List<Admin> admins=adminServices.listAdmins();
			request.setAttribute("admins", admins);
			return "manageadmins";
		}
	}
	@RequestMapping(value="/adminlogin",method=RequestMethod.POST)
	public String adminLogin(@RequestParam String userName,@RequestParam String password,HttpServletRequest request,ModelMap model) {
		Admin admin=null;
		try{
		admin=adminServices.adminLogin(userName, password);
		request.getSession().setAttribute("adminlogin", admin);
		List<Questions> qlist=questionServices.displayQuestions();
		request.setAttribute("qlist", qlist);
		}catch(NoResultException e){}
		if(admin==null){
			model.addAttribute("nameerror", "Username or password error");
			return "admin";
		}else{
		return "dashboard";
		}
	}
	@RequestMapping(value="/manageadmin",method=RequestMethod.GET)
	public String manageAdmin(HttpServletRequest request){
		List<Admin> admins=adminServices.listAdmins();
		request.setAttribute("admins", admins);
		System.out.println(admins.size());
		return "manageadmins";
	}
	
	
	
	@RequestMapping(value="/adminlogout",method=RequestMethod.GET)
	public String adminLogout(HttpSession session){
		session.invalidate();
		return "admin";
	}
	
}
