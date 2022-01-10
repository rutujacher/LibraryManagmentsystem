<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Librarian</title>
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
<div class='container'>
<h3 align="center">List Of Librarian</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Contact</th>
<th>Edit</th>
</tr>
<c:forEach var="user" items="${librarianinfo}">
<tr>
<td>${user.lid}</td>
<td>${user.lname}</td>
<td>${user.lemail}</td>
<td>${user.lpassword}</td>
<td>${user.lcontact}</td>
<td><a href="/editLibrarianForm?lid=${user.lid}">Edit</a></td>
</tr>
</c:forEach>


</table>
</div>
  <div id="footer">� 2020 Copyright:LibraryManagement</div>
  
</body>
</html>