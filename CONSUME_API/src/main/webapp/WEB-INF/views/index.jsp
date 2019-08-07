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
		<th>Name</th><th>Invention</th><th>Year</th>
	</tr>
	</thead>
	<tbody>
			<c:forEach items="${tiny }"  var="tinyitem">
			<tr>
					<td>${tinyitem.name }</td>
					<td>${tinyitem.invented }</td>
					<td>${tinyitem.year }</td>	
			</tr>
			</c:forEach>
	</tbody>
</table>
<p><a href="/complete">Display complete list</a></p>
</body>
</html>