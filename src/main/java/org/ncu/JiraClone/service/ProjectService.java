package org.ncu.JiraClone.service;

import java.util.List;

import org.ncu.JiraClone.entity.Project;

public interface ProjectService {
	public String createRecord(Project prj);
	public int updateRecord(Project p, int prjId);
	public int deleteRecord(int prjId);
	public Project fetchProject(int prjId);
	public List<Project> loadProjects();
}
