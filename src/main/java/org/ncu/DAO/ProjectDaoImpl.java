package org.ncu.JiraClone.DAO;

import java.util.List;

import org.ncu.JiraClone.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertProject(Project prj) {
		// TODO Auto-generated method stub
		String query = "insert into project values(?,?,?,?,?,?,?,?)";
		Object[] arr = {prj.getProject_id(), prj.getProject_name(), prj.getProject_desc(), prj.getUser_assigned(), prj.getProject_status(), prj.getProject_priority(), prj.getDifficulty_level(), prj.getComments()};
		int result = jdbcTemplate.update(query, arr);
		return result;
	}

	@Override
	public int deleteProject(int prjId) {
		// TODO Auto-generated method stub
		String query= "delete from project where project_id=?";
		int result = jdbcTemplate.update(query, prjId);
		return result;
	}

	@Override
	public int updateProject(Project p, int prjId) {
		// TODO Auto-generated method stub
		String query= "update project set project_name=?, project_desc=?, user_assigned=?, project_status=?, project_priority=?, difficulty_level=?, comments=? where project_id=?";
		int result = jdbcTemplate.update(query,p.getProject_name(),p.getProject_desc(),p.getUser_assigned(),p.getProject_status(),p.getProject_priority(),p.getDifficulty_level(),p.getComments(),prjId);
		return result;
	}

	@Override
	public Project getProject(int prjId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectRecords() {
		// TODO Auto-generated method stub
		String query = "select * from project";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Project>(Project.class));
	}



}
