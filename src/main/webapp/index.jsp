<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body style="background-color:wheat;">
<nav class="navbar navbar-inverse">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display 
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>-->
      <a class="navbar-brand" href="#">eLibrary</a>
    

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/" class="active">Home</a></li>
        <li><a href="AdminLogin.jsp">Admin</a></li>
        <li><a href="LibrarianLogin.jsp">Librarian</a></li>
        <li><a href="StudentLoginForm.jsp">Student</a></li>
       </ul>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container-fluid">
<h1 style="color:red;">eLibrary</h1>

<div class="row">
  <div class="col-md-4">
  <h3>Admin Login</h3>
  <form action="/adminLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="username">User Name</label>
    <input type="text" class="form-control" name="aName" id="adminName" placeholder="User Name"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="aPassword" id="password1" placeholder="Password"/>
  </div>  
  
 <div align="center"> <button type="submit" class="btn btn-primary">Login</button></div>
  
</form>
  
  </div>
  <div class="col-md-4">
  <h3>Librarian Login</h3>
  <form action="/librarianLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="email1">Email address</label>
    <input type="email" class="form-control" id="email1" name="lemail" placeholder="Email"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" id="password1" name="lpassword" placeholder="Password"/>
  </div>  
  <div align="center"><button type="submit" class="btn btn-primary">Login</button></div>
</form>
</div>
<div class="col-md-4">
  <h3>Student Login</h3>
  <form action="/studentLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="email1">Email address</label>
    <input type="email" class="form-control" id="email1" name="stud_email" placeholder="Email"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" id="password1" name="stud_password" placeholder="Password"/>
  </div>  
  <div align="center"><button type="submit" class="btn btn-primary" style="align:center">Login</button></div>
</form>
</div>
</div>

  </div>
  <div id="footer">© 2020 Copyright:LibraryManagement</div>
   
  </body>
  </html>
   