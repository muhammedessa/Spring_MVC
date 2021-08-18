<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Create Student  </h1>

 
<form:form method="POST" modelAttribute="student" action="saveStudent">
      <table>
          <tr>
              <td>student number:</td>
              <td><form:input path="student_id" /></td>
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
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>
  </form:form>



</body>
</html>