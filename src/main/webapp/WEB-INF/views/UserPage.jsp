<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<head>
    <title>User Page</title>
    <link rel="stylesheet" href="resources/UserPageStyle.css">
</head>

<body>
    <main class="table">
        <section class="table__header">
            <h1>List Of Projects</h1>
        </section>
        <section class="table__body">
            <table>
                <thead>
                    <tr>
                        <th> Project Id </th>
                        <th> Project Name </th>
                        <th> Project Description </th>
                        <th> User Assigned </th>
                        <th> Project Status </th>
                        <th> Project Priority </th>
                        <th> Difficulty Level </th>
                        <th> Comments</th>
                        <th> Update/Delete </th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="project" items="${projects}">
                    <tr>
                        <td>${project.project_id } </td>
                        <td>${project.project_name } </td>
                        <td>${project.project_desc } </td>
                        <td>${project.user_assigned } </td>
                        <td>${project.project_status } </td>
                        <td>${project.project_priority } </td>
                        <td>${project.difficulty_level } </td>
                        <td>${project.comments } </td>
                        <td><a href = "addComment?prjId=${project.project_id }">Add Comments</a>
                        </td>
                       </tr>
                 	</c:forEach>
                </tbody>
            </table>
        </section>
    </main>
</body>

</html>