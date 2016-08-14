package org.controller.idea;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.idea.User;
import org.service.idea.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	UserServices userService;
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam String email,String password,HttpServletRequest request){
		User user=userService.login(email, password);
		request.getSession().setAttribute("userlogin", user);
		return "startquiz";
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logOut(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
}
