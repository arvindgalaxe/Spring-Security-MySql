<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addbooks" method="post" modelAttribute="mybook">
<table>
<tr>
<td>Book Name</td>
<td>
<form:input path="name" type="text"/>
</td>
</tr>
<tr>
<td>Book Author</td>
<td>
<form:input path="author" type="text"/>
</td>
</tr>
<tr>
<td>ISBN</td>
<td>
<form:input path="isbn" type="text"/>
</td>
</tr>
<tr>
<td>Price</td>
<td>
<form:input path="price" type="text"/>
</td>
</tr>
</table>
<input type="submit" value="Add Books"/>
</form:form>
</body>
</html>