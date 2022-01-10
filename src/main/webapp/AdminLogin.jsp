<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
    

</head>
<body style="background-color:wheat;">
<nav class="navbar navbar-inverse">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">eLibrary</a>
    </div>
<!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp" >Home</a></li>
        <li><a href="AdminLogin.jsp" class="active">Admin</a></li>
        <li><a href="LibrarianLogin.jsp">Librarian</a></li>
        <li><a href="StudentLoginForm.jsp">Student</a></li>
       </ul>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container-fluid"  >
<h1 align="center">eLibrary</h1><br>
<div>
  <h3 align="center">Admin Login</h3>
  <form action="/adminLogin" method="post" style="width:300px;margin-left:40%;margin-right:40%;">
  <div class="form-group">
    <label >User Name</label>
    <input type="text" class="form-control" name="aName" placeholder="User Name"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="aPassword"  placeholder="Password"/>
  </div>  
  <center><button type="submit" class="btn btn-primary">Login</button></center>
</form>
</div>
</div>

<div id="footer">� 2020 Copyright:LibraryManagement</div>
  </body>
  </html>
  