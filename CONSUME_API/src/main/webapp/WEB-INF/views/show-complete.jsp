<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css" />
</head>
<body>

<table class="table" border="2" cellpadding="7">
	<thead>
	<tr>
		<th>First Name</th><th>Last Name</th><th>Innovation</th><th>Year</th>
	</tr>
	</thead>
	<tbody>
			<c:forEach items="${complete }"  var="completeitem">
			<tr>
					<td>${completeitem.firstName }</td>
					<td>${completeitem.lastName }</td>
					<td>${completeitem.innovation }</td>
					<td>${completeitem.year }</td>	
			</tr>
			</c:forEach>
	</tbody>
</table>

<p><a href="/">Display tiny list</a></p>
</body>
</html>