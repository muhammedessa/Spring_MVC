<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Student List</h1>

 

<form action="addStudent">  
<input type="submit" value="Add Student" />   
</form>

<br><br><br>

<table border="1">
		<tr>
			<th>Id</th>
			<th>student_id</th>
			<th>name</th>
			<th>city</th>
			<th>age</th>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.id}</td>
				<td>${student.student_id}</td>
				<td>${student.name}</td>
				<td>${student.city}</td>
				<td>${student.age}</td>
				<td><a href="edit?id=<c:out value='${student.id}'/>">Update</a> | <a
					href="delete/<c:out value='${student.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>