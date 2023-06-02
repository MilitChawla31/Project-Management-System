<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<link rel="stylesheet" href="resources/SignUpFormStyle.css" />
<style>
	.error{
		color: red
		}
</style>
<title>Sign Up Form</title>
</head>
<body>
	<div class="container">
		<header>Sign Up Here</header>
		<form:form action="display" method="post" modelAttribute="user" class="form">
			
			<div class="input-box">
				<label for="name"> Name </label>
				<form:input type="text" placeholder="Enter your Name" path="name" />
				<form:errors path = "name" cssClass = "error"></form:errors>
			</div>
			
			<div class="input-box">
				<label for="password"> Password </label>
				<form:input type="password" placeholder="Enter Password" path="password" />
				<form:errors path = "password" cssClass = "error"></form:errors>
			</div>

			<div class="input-box">
				<label for="email">Email</label>
				<form:input type="email" placeholder="Enter Email" path="email" />
				<form:errors path = "email" cssClass = "error"></form:errors>
			</div>

			<div class="input-box">
				<label for="priority">User Type</label>
				<div class="select-box">
					<form:select path="type" placeholder="Select Type">
					<form:errors path = "type" cssClass = "error"></form:errors>
						<form:option value=" " label=" Select Type"/>
						<form:option value="Adimin" label="Admin"/>
						<form:option value="User" label="User"/>
						
					</form:select>
				</div>
			</div>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>