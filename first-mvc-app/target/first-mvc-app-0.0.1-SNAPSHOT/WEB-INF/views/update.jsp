<%@ include file="includes/header.jspf" %>
<body>

<%@ include file="includes/navbar.jspf" %>

<div class="container">

  

<form action="/update" method="POST">

    <input type="text"   name="id" value="${student.id}" hidden  required>


  <div class="form-group">
    <label for="exampleInputEmail1">name </label>
    <input type="text" class="form-control" name="name" value="${student.name}" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">date</label>
    <input type="text" class="form-control"  name="date" value="${student.date}"  required>
  </div> 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>  
</div>


<br>


 
<%@ include file="includes/footer.jspf" %>