package org.controller.idea;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.model.idea.Questions;
import org.service.idea.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuestionController {

	@Autowired
	QuestionServices questionServices;
	
	@RequestMapping(value="/addquestion",method=RequestMethod.POST)
	public String createAdmin(@ModelAttribute("addQuestion") Questions question,HttpServletRequest request) {
		questionServices.createQuestion(question);
		List<Questions> qlist=questionServices.displayQuestions();
		request.setAttribute("qlist", qlist);
		return "dashboard";
	}
}
