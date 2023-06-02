package org.ncu.JiraClone.service;

import java.util.List;

import org.ncu.JiraClone.DAO.ProjectDao;
import org.ncu.JiraClone.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao prjDao;
	
	
	@Override
	public String createRecord(Project prj) {
		// TODO Auto-generated method stub
		int result = prjDao.insertProject(prj);
		if(result==0) {
			return "Error Saving Record";
		}
		else {
			return "Record Insertrd Successfully";
		}
	}

	@Override
	public int updateRecord(Project p, int prjId) {
		// TODO Auto-generated method stub
		int res=prjDao.updateProject(p, prjId);
		if (res>0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int deleteRecord(int prjId) {
		// TODO Auto-generated method stub
		int res=prjDao.deleteProject(prjId);
		if (res>0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public Project fetchProject(int prjId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> loadProjects() {
		// TODO Auto-generated method stub
		List<Project> prj = prjDao.getProjectRecords();
		if(prj!=null) {
			return prj;
		}
		else {
			return null;
		}
	}



}
