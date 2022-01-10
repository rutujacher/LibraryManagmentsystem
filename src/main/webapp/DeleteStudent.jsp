<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body style="background-color:wheat;">
<nav class="navbar navbar-inverse">
  <div class="container">
      <a class="navbar-brand" href="#">eLibrary</a>
   
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/">Home</a></li>
        <li><a href="/addLibrarianForm">Add Librarian</a></li>
        <li><a href="/viewLibrarian">View Librarian</a></li>
        <li><a href="/deleteLibrarianForm">Delete Librarian</a></li>
        <li><a href="/addStudentForm">Add Student</a></li>
        <li><a href="/viewStudent">View Student</a></li>
        <li><a href="/deleteStudentForm">Delete Student</a></li>
        <li><a href="/">Logout</a></li>
       </ul>

    </div><!-- /.navbar-collapse -->
    </div>
 </nav>
<h3 align="center">Delete Student</h3>
  <form action="/deleteStudent" style="width:300px;margin-left:40%;margin-right:40%;">
   <div class="form-group">
    <label for="student id">Student Id</label>
    <input type="text" class="form-control" name="stud_id" placeholder="Student Id"/>
  </div>
  <div align="center"><button type="submit" class="btn btn-primary">Submit</button></div>
</form>
<div id="footer">© 2020 Copyright:LibraryManagement</div>

</body>
</html>