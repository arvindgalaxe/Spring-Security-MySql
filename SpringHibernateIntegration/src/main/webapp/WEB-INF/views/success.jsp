<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Book Details are</h2>
<h4 align="right"><a href="newbook">Add New Book</a></h4>
<table border="2">
<tr>
<th>ID</th>
<th>Book Name</th>
<th>Book Author</th>
<th>Book ISBN</th>
<th>Book Price</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach items="${listOfBooks}" var="books">
        <tr>
            <td>${books.id}</td>
            <td>${books.name}</td>
            <td>${books.author}</td>
            <td>${books.isbn}</td>
            <td>${books.price}</td>
            <td><a href="<c:url value='/edit/${books.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/delete/${books.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
</table>
<center><h3>No of Books in store: ${listOfBooks.size()}</h3></center>
</center>
</body>
</html>