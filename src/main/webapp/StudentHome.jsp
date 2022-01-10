<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<style>
body {
  background-image: url('/images/student1.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;

}
</style>
</head>
<body style="background-color:wheat;">
<nav class="navbar navbar-inverse">
  <div class="container">
      <a class="navbar-brand" href="#">eLibrary</a>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#">Student Home</a></li>
        <li><a href="studentProfile?stud_email=${stud_email}">Profile</a></li>
        
        <li><a href="/viewBooks">View Book</a></li>
        <li><a href="/studentIssue?stud_email=${stud_email}">View Issued Book</a></li>
        <li><a href="index.jsp">Logout</a></li>
       </ul>
       
    </div>
  </div>
</nav>
<!--  <div>
<img alt="Student home" src="/images/student1.jpg">
</div>-->
     
  <div id="footer">© 2020 Copyright:LibraryManagement</div>

</body>
</html>