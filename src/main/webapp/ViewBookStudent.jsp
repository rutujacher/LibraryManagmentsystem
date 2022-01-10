<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
        
        <li><a href="/viewBooks">View Book</a></li>
       <!--   <li><a href="/studentIssue?stud_email=${stud_email}">View Issued Book</a></li>
        <li><a href="/">Logout</a></li>
       </ul>
       
    </div>-->
  </div>
</nav>
<div class='container'>
<h3 align="center">View Books</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Book Id</th>
<th>call Number</th>
<th>Name</th>
<th>Author</th>
<th>Publisher</th>
<th>Quantity</th>
<th>Issued</th>
</tr>
<c:forEach var="book" items="${bookinfo}">
<tr>
<td>${book.book_id}</td>
<td>${book.book_callno}</td>
<td>${book.book_name}</td>
<td>${book.book_author}</td>
<td>${book.book_publisher}</td>
<td>${book.book_quantity}</td>
<td>${book.book_issued}</td>
</tr>
</c:forEach>

</table>
</div>
<div id="footer">© 2020 Copyright:LibraryManagement</div>

</body>
</html>