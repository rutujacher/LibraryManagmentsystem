<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add student</title>
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
 <div class="container-fluid" >
<h3 align="center">Add Student</h3>
  <form action="/addStudent" method="post" style="width:300px;margin-left:40%;margin-right:40%;">
  <div class="form-group">
    <label for="enrollment">Enrollment Number</label>
    <input type="text" class="form-control" name="stud_enrollment" id="enrollment" placeholder="Enrollment Number"/>
  </div>
  <div class="form-group">
    <label for="name1">Name</label>
    <input type="text" class="form-control" name="stud_name" id="name1" placeholder="Name"/>
  </div>
  <div class="form-group">
    <label for="email1">Email address</label>
    <input type="email" class="form-control" name="stud_email" id="email1" placeholder="Email"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="stud_password" id="password1" placeholder="Password"/>
  </div>  
  <div class="form-group">
    <label for="mobile1">Contact Number</label>
    <input type="text" class="form-control" name="stud_contact" id="mobile1" placeholder="Contact Number"/>
  </div>
  <center><button type="submit" class="btn btn-primary">Submit</button></center>
</form>
</div>
  <div id="footer">� 2020 Copyright:LibraryManagement</div>
  
</body>
</html>