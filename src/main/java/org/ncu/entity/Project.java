package org.ncu.JiraClone.entity;

public class Project {
	
	private int project_id;
	private String project_name;
	private String project_desc;
	private String user_assigned;
	private String project_status;
	private String project_priority;
	private String difficulty_level;
	private String comments;
	
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Project(int project_id, String project_name, String project_desc, String user_assigned,
			String project_status, String project_priority, String difficulty_level, String comments) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_desc = project_desc;
		this.user_assigned = user_assigned;
		this.project_status = project_status;
		this.project_priority = project_priority;
		this.difficulty_level = difficulty_level;
		this.comments = comments;
	}


	public int getProject_id() {
		return project_id;
	}


	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	public String getProject_desc() {
		return project_desc;
	}


	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}


	public String getUser_assigned() {
		return user_assigned;
	}


	public void setUser_assigned(String user_assigned) {
		this.user_assigned = user_assigned;
	}


	public String getProject_status() {
		return project_status;
	}


	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}


	public String getProject_priority() {
		return project_priority;
	}


	public void setProject_priority(String project_priority) {
		this.project_priority = project_priority;
	}


	public String getDifficulty_level() {
		return difficulty_level;
	}


	public void setDifficulty_level(String difficulty_level) {
		this.difficulty_level = difficulty_level;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", project_desc=" + project_desc
				+ ", user_assigned=" + user_assigned + ", project_status=" + project_status + ", project_priority="
				+ project_priority + ", difficulty_level=" + difficulty_level + ", comments=" + comments + "]";
	}
	
	


}
