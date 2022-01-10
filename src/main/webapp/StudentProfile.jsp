<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Profile</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body style="background-color:wheat;">
<nav class="navbar navbar-inverse">
  <div class="container">
      <a class="navbar-brand" href="#">eLibrary</a>
    
    <!-- Collect the nav links, forms, and other content for toggling 
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="StudentHome.jsp">Student Home</a></li>
        <li><a href="studentProfile?stud_email=${stud_email}">Profile</a></li>
        
      <!--    <li><a href="/viewBooks?stud_email=${stud_email}">View Book</a></li>
        <li><a href="/studentIssue?stud_email=${stud_email}">View Issued Book</a></li>
        <li><a href="index.jsp">Logout</a></li>
       </ul>
       
    </div>-->
  </div>
</nav>
<div align="center">
<div class="container">
<p style="color:red;font-family:verdana;font-size:200%;">
Your Profile:<br><br>
Student Id:${studProfile.stud_id}<br>
Enrollment Number:${studProfile.stud_enrollment}<br>
Name:${studProfile.stud_name}<br>
Email:${studProfile.stud_email}<br>
Password:${studProfile.stud_password}<br>
Contact Number:${studProfile.stud_contact}<br>
</p>
</div>
</div>

<div id="footer">© 2020 Copyright:LibraryManagement</div>
</body>
</html>