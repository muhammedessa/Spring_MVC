<%@ include file="includes/header.jspf" %>
<body>

<%@ include file="includes/navbar.jspf" %>


<h1>Hello ${name}</h1> 


<div class="container">

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Date</th>
      <th scope="col">Active</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
 		 <c:forEach items="${students}" var="stud">
         <tr>
	      <th scope="row">${stud.id}  </th>
	      <td> ${stud.name} </td>
	      <td> ${stud.date }</td>
	      <td>${stud.isActive }</td>
	      <td> <a href="/delete?id=${stud.id}"  class="btn btn-danger">Delete</a>
	        <a href="/edit?id=${stud.id}"  class="btn btn-success">Edit</a>   </td>
	    </tr>  
		</c:forEach>
   
  </tbody>
</table> 
 
 

 
</div>

 <div class="container">

 <a  class="btn btn-primary" href="/add">add student</a>

 
</div>



<%@ include file="includes/footer.jspf" %>