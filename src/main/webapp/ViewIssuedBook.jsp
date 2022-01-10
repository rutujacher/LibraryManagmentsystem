<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Issued Books</title>
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
        <li><a href="/">Logout</a></li>       </ul>

    </div>
  </div>
</nav>
<div class='container'>
<h3 align="center">Issued Books</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Book Id</th>
<th>Student Id</th>
<th>Issue Date</th>
<th>Return Status</th>
</tr>
<c:forEach var="issueBook" items="${issueInfo}">
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