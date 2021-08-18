<%@ include file="includes/header.jspf" %>
<body>

<%@ include file="includes/navbar.jspf" %>
<div class="container">

 
 <c:if test="${errorName.length() > 0}">
 <div class="alert alert-warning" role="alert">
  <c:out value="${errorName }"></c:out>
</div> 
 </c:if>
   

<form action="/add-student" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">name </label>
    <input type="text" class="form-control" name="name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">date</label>
    <input type="text" class="form-control"  name="date" required>
  </div> 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>  
</div>


<br>

<%@ include file="includes/footer.jspf" %>
 