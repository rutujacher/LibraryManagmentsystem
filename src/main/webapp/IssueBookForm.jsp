<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Issue Book</title>
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

    </div>
  </div>
</nav>
<div class="container-fluid">
<h3 align="center">Issue Book</h3>
  <form action="/issueBook" method="post" style="width:300px;margin-left:40%;margin-right:40%;">
  <div class="form-group">
    <label for="callno1">Book Id</label>
    <input type="text" class="form-control" name="book_id" id="bookid" placeholder="Book Id"/>
  </div>
  <div class="form-group">
    <label for="id1">Student Id</label>
    <input type="text" class="form-control" name="stud_id" id="id1" placeholder="Student Id"/>
  </div>
  <div class="form-group">
    <label for="name1">Issue Date</label>
    <input type="date" class="form-control" name="issue_date" id="name1" placeholder="Issue Date"/>
  </div>
  <div align="center"><button type="submit" class="btn btn-primary">Issue Book</button></div>
</form>
</div>
<div id="footer">© 2020 Copyright:LibraryManagement</div>

</body>
</html>