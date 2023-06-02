<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<link rel="stylesheet" href="resources/ProjectFormStyle.css" />
<title>Project Update Form</title>
</head>
<body>
	<div class="container">
		<header>Update Projects</header>

		<form:form action="addcommentprocess" method="post" modelAttribute="project" 
			class="form">
			<div class="input-box">
				<label for="id">Project Id</label>
				<form:input  value="${id}" readonly="true" type="text" placeholder="Enter Project Id" path="project_id" />
				
			</div>
			
			<div class="input-box">
				<label for="name"> Project Name </label>
				<form:input type="text" placeholder="Enter Project Name"
					path="project_name" value="" readonly="true" />
			</div>

			<div class="input-box">
				<label for="description"> Project Description </label>
				<form:input value="${description}" readonly="true" type="text" placeholder="Enter Project Description"
					path="project_desc"  />
			</div>

			<div class="input-box">
				<label for="user">User Assigned</label>
				<form:input type="text" placeholder="Enter User to be Assigned"
					path="user_assigned" value="${user}" readonly="true" />
			</div>

			<div class="input-box">
				<label for="status"> Project Status</label>
				<form:input type="text" placeholder="Enter Project Status"
					path="project_status" value="${status}" readonly="true" />
			</div>

			<div class="input-box">
				<label for="priority">Project Priority</label>
				<div class="select-box">
					<form:select path="project_priority" value="${priority}" readonly="true">
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
						<form:radiobutton path="difficulty_level"  value="${difficulty}" readonly="true" />
						2
						<form:radiobutton path="difficulty_level"  value="${difficulty}" readonly="true" />
						3
						<form:radiobutton path="difficulty_level"  value="${difficulty}" readonly="true" />
						4
						<form:radiobutton path="difficulty_level"  value="${difficulty}" readonly="true" />
						5
						<form:radiobutton path="difficulty_level"  value="${difficulty}" readonly="true" />
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