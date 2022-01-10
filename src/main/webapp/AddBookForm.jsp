<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<body style="background-color:wheat;">
<nav class="navbar navbar-inverse">
  <div class="container">
      <a class="navbar-brand" href="#">eLibrary</a>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/">Home</a></li>
        <li><a class="active" href="/addBookForm">Add Book</a></li>
        <li><a href="/viewBook">View Book</a></li>
        <li><a href="/issueBookForm">Issue Book</a></li>
        <li><a href="/viewIssuedBook">View Issued Book</a></li>
        <li><a href="/returnBookForm">Return Book</a></li>
        <li><a href="/">Logout</a></li>
       </ul>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container-fluid" >
<h3 align="center">Add Book</h3>
  <form action="/addBook" method="post" style="width:300px;margin-left:40%;margin-right:40%;">
   <div class="form-group">
    <label for="callno1">Callno</label>
    <input type="text" class="form-control" name="book_callno" id="callno1" placeholder="Callno"/>
  </div>
  <div class="form-group">
    <label for="name1">Name</label>
    <input type="text" class="form-control" name="book_name" id="name1" placeholder="Name"/>
  </div>
  <div class="form-group">
    <label for="author1">Author</label>
    <input type="text" class="form-control" name="book_author" id="author1" placeholder="Author"/>
  </div>
  <div class="form-group">
    <label for="publisher1">Publisher</label>
    <input type="text" class="form-control" name="book_publisher" id="publisher1" placeholder="Publisher"/>
  </div>
  <div class="form-group">
    <label for="quantity1">Quantity</label>
    <input type="number" class="form-control" name="book_quantity" id="quantity1" placeholder="Quantity"/>
  </div>
  <center><button type="submit" class="btn btn-primary">Save Book</button></center>
</form>
</div>
<div id="footer">© 2020 Copyright:LibraryManagement</div>

</body>
</html>