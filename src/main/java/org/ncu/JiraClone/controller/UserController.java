package org.ncu.JiraClone.controller;

import javax.validation.Valid;

import org.ncu.JiraClone.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.GET )
	public String showSignUp() {
		return "SignUpForm";
	}
	
	@RequestMapping(value = "/display")
	public String displayForm( @ModelAttribute("user") User user, @Valid @ModelAttribute("user")User userr, BindingResult bindingresult) {
		System.out.println(user);
		if(bindingresult.hasErrors()) { 
			return "error"; 
			} 
		else { 
			return "HomePage";
		 } 
	}
}
