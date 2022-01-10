<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Issued Books</title>
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
        <li><a href="/studentHome">Student Home</a></li>
       <!--   <li><a href="studentProfile?stud_email=${stud_email}">Profile</a></li>
        
        <li><a href="/viewBooks">View Book</a></li>
        <li><a class="active" href="#">View Issued Book</a></li>
        <li><a href="index.jsp">Logout</a></li>
       </ul>
       
    </div>-->
  </div>
</nav>
<div class='container'>
<h3>Student Issued Books</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Book Id</th>
<th>Student Id</th>
<th>Issue Date</th>
<th>Return Status</th>
</tr>
<c:forEach var="issueBook" items="${IssueBook}">
<tr>
<td>${issueBook.book_id}</td>
<td>${issueBook.stud_id}</td>
<td>${issueBook.issue_date}</td>
<td>${issueBook.return_status}</td>
</tr>
</c:forEach>
</table>
</div>
<div id="footer">© 2020 Copyright:LibraryManagement</div>

</body>
</html>