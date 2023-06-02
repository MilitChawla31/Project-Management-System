package org.ncu.JiraClone.entity;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User{
	
	@NotNull(message = "is required")
	@Size(min = 2, message = "is required")
	private String name;
	
	@NotNull(message = "is required")
	@Pattern(regexp="[a-zA-Z0-9].{5,}", message = "only char/digit allowed")
	private String password;
	
	@Email
	private String email;
	
	private String type;
	
	private Map<String,String>typeOptions;

	public User() {
		super();
		// TODO Auto-generated constructor stub
		
		typeOptions = new HashMap<>();
		typeOptions.put(" ", " ");
		typeOptions.put("Admin", "Admin");
		typeOptions.put("User", "User");
	}

	public User(String name, String password, String email, String type) {
		super();
		this.name = name;
		this.password = password;
		this.email = email; 
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", type=" + type + "]";
	}
	
	
}
