package org.ncu.JiraClone.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.JiraClone.entity.Project;
import org.springframework.jdbc.core.RowMapper;

public class ProjectRowMapper implements RowMapper<Project> {
	
Project prj = new Project();
	
	@Override
	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		prj.setProject_id(rs.getInt(1));
		prj.setProject_name(rs.getString(2));
		prj.setProject_desc(rs.getString(3));
		prj.setUser_assigned(rs.getString(4));
		prj.setProject_status(rs.getString(5));
		prj.setProject_priority(rs.getString(6));
		prj.setDifficulty_level(rs.getString(7));
		prj.setComments(rs.getString(8));
		return prj;
		
		

	}
}
