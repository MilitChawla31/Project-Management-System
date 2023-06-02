package org.ncu.JiraClone.controller;

import org.ncu.JiraClone.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	@RequestMapping(value = "/adminLoginForm", method = RequestMethod.POST)
	public String adminLoginForm(@ModelAttribute Admin admin) {
		System.out.println(admin);
		return "AdminLoginForm";
		
	}
	
	@RequestMapping(value = "/adminPage")
	public String adminPage() {
		return "AdminPage";
	}
	
	@RequestMapping(value = "/addProject")
	public String addProject() {
		return "ProjectForm";
	}
}
