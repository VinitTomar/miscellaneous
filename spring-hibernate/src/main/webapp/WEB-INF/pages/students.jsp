<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Student List</h1>
		
		<table border="1">

		<tr>	
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Date of Birth</th>
			<th>Action</th>
		</tr>
			<c:forEach var="student" items="${listStudent}">
				<tr>

					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.address}</td>
					<td>${student.dateOfBirth}</td>
					<td><a href="students/editStudent?id=${student.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="students/deleteStudents?id=${student.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Student Register <a href="students/newStudent">here</a><br/>
			Homepage <a href="/SpringMVCHibernateCRUD/">here</a>
		</h4>
	</div>
</body>
</html>