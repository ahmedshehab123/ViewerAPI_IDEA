package org.controller.idea;


import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.idea.Questions;
import org.model.idea.User;
import org.service.idea.QuestionServices;
import org.service.idea.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	UserServices userService;
	@Autowired
	QuestionServices questionServices;
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam String email,String password,HttpServletRequest request,ModelMap model){
		User user=null;
		try{	
		user=userService.login(email, password);
		request.getSession().setAttribute("userlogin", user);
		}catch(NoResultException e){}
		if(user==null){
			model.addAttribute("error", "Username or password error");
		return "loginpage";
		}else{
			int i=3;
		Questions question=questionServices.quizQuestions(i);
		System.out.println(question.getQuestion());
		request.setAttribute("question", question);
		return "startquiz";
		}
		
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logOut(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
}
