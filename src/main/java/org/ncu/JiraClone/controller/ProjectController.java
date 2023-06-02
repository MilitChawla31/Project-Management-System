package org.ncu.JiraClone.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.ncu.JiraClone.entity.Project;
import org.ncu.JiraClone.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectController {
	
	@Autowired
	ProjectService prjService;
	
	@ModelAttribute(name="project")
	public Project getProject() {
		return new Project();
	}
	
	
	@RequestMapping(value="/register", method = RequestMethod.GET) 
	public String showForm() { 
		return "ProjectForm"; 
	}
	 
	
	@RequestMapping(value="/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("project") Project prj, Model model) {
		prjService.createRecord(prj);
	
		return "AdminPage";
	}
	
	@RequestMapping(value="/showDetails", method=RequestMethod.GET)
	public String displayFormDetails(Model model) {
		List<Project>prj = prjService.loadProjects();
		System.out.println(prj);
		model.addAttribute("projects", prj);
		return "AdminPage";
	}
	
	@RequestMapping(value="/showUserDetails", method=RequestMethod.GET)
	public String displayUserFormDetails(Model model) {
		List<Project>prj = prjService.loadProjects();
		System.out.println(prj);
		model.addAttribute("projects", prj);
		return "UserPage";
	}
	
	@RequestMapping(value="/deletePrj", method=RequestMethod.GET)
	public String deletePrj(int prjId, Model model) {
		int res=prjService.deleteRecord(prjId);
		if (res>0) {
			return "AdminPage";
		}
		else {
			return "error";
		}
	}
	
	@RequestMapping(value="/updateForm", method=RequestMethod.GET)
	public String updateFormDetails(int prjId, HttpServletRequest req) {
		HttpSession ses=req.getSession();
		ses.setAttribute("id", prjId);
		return "ProjectUpdateForm";
	}
	
	@RequestMapping(value="/addComment", method=RequestMethod.GET)
	public String addUserComments(int prjId, HttpServletRequest req) {
		HttpSession ses=req.getSession();
		ses.setAttribute("id", prjId);
		return "AddComments";
	}
	
	@RequestMapping(value="/updateprocess", method=RequestMethod.POST)
	public String updateForm(@ModelAttribute("project") Project prj, Model model, HttpServletRequest req) {
		HttpSession ses=req.getSession(false);
		int id=(int) ses.getAttribute("id");
		int res=prjService.updateRecord(prj, id);
		if (res>0) {
			return "AdminPage";
		}
		else {
			return "error";
		}
	}
	
	@RequestMapping(value="/addcommentprocess", method=RequestMethod.POST)
	public String addComment(@ModelAttribute("project") Project prj, Model model, HttpServletRequest req) {
		HttpSession ses=req.getSession(false);
		int id=(int) ses.getAttribute("id");
		int res=prjService.updateRecord(prj, id);
		if (res>0) {
			return "UserPage";
		}
		else {
			return "error";
		}
	}

}
