package org.controller.idea;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.model.idea.User;
import org.service.idea.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired
	UserServices userService;

	@RequestMapping(value="/registerpage",method=RequestMethod.GET)
	public String getregister(){
		
		return "createuser";
	}
	@RequestMapping(value="/createuser",method=RequestMethod.POST)
	public String createUser(@ModelAttribute("signup") User user,HttpServletRequest request,ModelMap model){
		try{
		user=userService.checkExistingEmail(user.getEmail());}catch(NoResultException e){}
		if(user==null){
		 user=userService.createUser(user);
		 System.out.println("email"+user.getEmail());
		 request.getSession().setAttribute("userlogin",user);
		return "startquiz";}
		else{
			model.addAttribute("emailexist", "The email you try to register is already exist try another one ");
			return "loginpage";
		}
	}
}
