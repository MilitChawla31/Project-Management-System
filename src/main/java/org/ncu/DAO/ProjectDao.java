package org.ncu.JiraClone.DAO;

import java.util.List;

import org.ncu.JiraClone.entity.Project;

public interface ProjectDao {
	public int insertProject(Project prj);
	public int deleteProject(int prjId);
	public int updateProject(Project p, int prjId);
	public Project getProject(int prjId);
	public List<Project> getProjectRecords();
}
