<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Persons Manage Page</title>
<style>
table,th,td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<%-- Person Add/Edit logic --%>
	
		<strong style="color: red;"><c:out
				value="${requestScope.error}"></c:out></strong>
	
	
		<strong style="color: green;"><c:out
				value="${requestScope.success}"></c:out></strong>
	
	<url value="/addPerson" var="addURL"></url>
	<url value="/editPerson" var="editURL"></url>

	<%-- Edit Request --%>
	
		<form action='<out value="${editURL}"></out>' method="post">
			ID: <input type="text" value="${requestScope.person.id}"
				readonly="readonly" name="id"><br> Name: <input
				type="text" value="${requestScope.person.name}" name="name"><br>
			Country: <input type="text" value="${requestScope.person.country}"
				name="country"><br> <input type="submit"
				value="Edit Person">
		</form>
	

	<%-- Add Request --%>
	
		<form action='<c:out value="${addURL}"></c:out>' method="post">
			Name: <input type="text" name="name"><br> Country: <input
				type="text" name="country"><br> <input type="submit"
				value="Add Person">
		</form>
	

	<%-- Persons List Logic --%>
	
		<table>
			<tbody>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Country</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:forEach items="${requestScope.persons}" var="person">
					<c:url value="/editPerson" var="editURL">
						<c:param name="id" value="${person.id}"></c:param>
					</c:url>
					<c:url value="/deletePerson" var="deleteURL">
						<c:param name="id" value="${person.id}"></c:param>
					</c:url>
					<tr>
						<td><c:out value="${person.id}"></c:out></td>
						<td><c:out value="${person.name}"></c:out></td>
						<td><c:out value="${person.country}"></c:out></td>
						<td><a
							href='<c:out value="${editURL}" escapeXml="true"></c:out>'>Edit</a></td>
						<td><a
							href='<c:out value="${deleteURL}" escapeXml="true"></c:out>'>Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
</body>
</html>