<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<link rel="stylesheet" href="resources/ProjectFormStyle.css" />
<title>Project Update Form</title>
</head>
<body>
	<div class="container">
		<header>Add Projects</header>
		<form:form action="processForm" method="post" modelAttribute="project" 
			class="form">
			<div class="input-box">
				<label for="id">Project Id</label>
				<form:input type="text" placeholder="Enter Project Id" path="project_id"/>
			</div>
			
			<div class="input-box">
				<label for="ProjectName"> Project Name </label>
				<form:input type="text" placeholder="Enter Project Name"
					path="project_name" />
			</div>

			<div class="input-box">
				<label for="ProjectDescription"> Project Description </label>
				<form:input type="text" placeholder="Enter Project Description"
					path="project_desc" />
			</div>

			<div class="input-box">
				<label for="UserAssigned">User Assigned</label>
				<form:input type="text" placeholder="Enter User to be Assigned"
					path="user_assigned" />
			</div>

			<div class="input-box">
				<label for="ProjectStatus"> Project Status</label>
				<form:input type="text" placeholder="Enter Project Status"
					path="project_status" />
			</div>

			<div class="input-box">
				<label for="priority">Project Priority</label>
				<div class="select-box">
					<form:select path="project_priority">
						<form:option value="HighestPriority" label="Highest Priority" />
						<form:option value="AveragePriority" label="Average Priority" />
						<form:option value="LeastPriority" label="Least Priority" />
					</form:select>
				</div>
			</div>
			<div class="level-box">
				<h3>Difficulty Level</h3>
				<div class="level-option">
					<div class="level">
						1
						<form:radiobutton path="difficulty_level" value="1" />
						2
						<form:radiobutton path="difficulty_level" value="2" />
						3
						<form:radiobutton path="difficulty_level" value="3" />
						4
						<form:radiobutton path="difficulty_level" value="4" />
						5
						<form:radiobutton path="difficulty_level" value="5" />
					</div>
				</div>
			</div>
			<div class="input-box">
				<label for="comments">Comments</label>
				<form:input type="text" placeholder="Enter Comments" path="comments" />
			</div>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>