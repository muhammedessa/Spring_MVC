<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Create a Student</h1>

<form:form action="saveStudent" method="POST" modelAttribute="student">

<table>
  
  <tr>
    <td>Student Number</td>
    <td><form:input path="student_id"/></td> 
  </tr>
  <tr>
   <td>Student Name</td>
    <td><form:input path="name"/></td> 
  </tr>
  <tr>
     <td>Student City</td>
    <td><form:input path="city"/></td> 
  </tr>
  <tr>
     <td>Student Age</td>
    <td><form:input path="age"/></td> 
  </tr> 
  
    <tr> 
    <td> <input type="submit" value="Save student" /> </td> 
  </tr> 
</table>


</form:form >



</body>
</html>