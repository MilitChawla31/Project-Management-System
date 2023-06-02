package org.ncu.JiraClone.entity;

public class Admin {
	private String FullName;
	private String Email;
	private String Password;
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [FullName=" + FullName + ", Email=" + Email + ", Password=" + Password + "]";
	}
}
