package org.ncu.JiraClone.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("HomePage");
	}
	@RequestMapping(value="/adminLogin")
	public String adminLogin() {
		return "AdminLoginForm";
	}
	
	@RequestMapping(value="/userLogin")
	public String userLogin() {
		return "UserLoginForm";
	}
	
	@RequestMapping(value="/signUp")
	public String signUp() {
		return "SignUpForm";
	}
}
