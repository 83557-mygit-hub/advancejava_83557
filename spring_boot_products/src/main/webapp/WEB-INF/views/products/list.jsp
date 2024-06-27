<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello, ${sessionScope.user}</h3>
	<table style="background-color: lightgrey; margin: auto;" border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${proList}">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<c:url var="url" value="/products/purchase?id=${product.id}" />
					<td><a href="${url}"><button>Purchase</button></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>