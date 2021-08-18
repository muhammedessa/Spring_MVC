<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>

<h1>Update Student  </h1>

 
<form:form method="POST" modelAttribute="student" action="update">
      <table>
          <tr>
             <input type="text"   name="id" value="${student.id}"   required>
              <td>student number:</td>
              <td><form:input path="student_id"/></td>
          </tr>
          <tr>
              <td>Name:</td>
              <td><form:input path="name" /></td>
          </tr>
           <tr>
              <td>City:</td>
              <td><form:input path="city" /></td>
          </tr>
           <tr>
              <td>Age:</td>
              <td><form:input path="age" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="update" />
              </td>
          </tr>
      </table>
  </form:form>



</body>
</html>