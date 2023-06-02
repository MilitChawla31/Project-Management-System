<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" href = "resources/AdminLoginFormStyle.css">
</head>
<body>
  <div class = "main">
    <div class="form-box">
        <form class="form" action ="adminLoginForm" method = "post">
            <span class="title">Admin Login</span>
            <span class="subtitle">Login with your Admin email.</span>
            <div class="form-container">
              <input type="text" class="input" placeholder="Full Name" name="FullName">
                    <input type="email" class="input" placeholder="Email" name="Email">
                    <input type="password" class="input" placeholder="Password" name="Password">
            </div>
            <button><a href="showDetails">Log In</a></button>
        </form>
        </div>
        </div>
</body>
</html>