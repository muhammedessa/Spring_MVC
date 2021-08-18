<%@ include file="includes/header.jspf" %>
<body>

<%@ include file="includes/navbar.jspf" %>

<div class="container">

<div class="alert alert-danger" role="alert">
 ${errorMsg}
</div> 

<form action="/login" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">username </label>
    <input type="text" class="form-control" name="name">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control"  name="password" >
  </div> 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

 


<%@ include file="includes/footer.jspf" %>

