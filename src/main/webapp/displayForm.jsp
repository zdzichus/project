<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
	<html>
		<head>
		<meta charset="UTF-8">
		<title>DzidekDisplay</title>
        <link rel="stylesheet" type="text/css" href="style.css">	
		</head>
			<body>
			<h2>Display Form:</h2>
			
			<form action="addressbook" method="POST">
			  <table border=1 cellpadding=3 cellspacing=0>
        <tr>
          <th>Name</th>
          <th>Surname</th>
          <th>Phone</th>
          <th>Gender</th>
        </tr>
          <tr>
            <td><%= request.getParameter("name") %></td>
            <td><%= request.getParameter("surname") %></td>
            <td><%= request.getParameter("phone") %></td>
            <td><%= request.getParameter("gender") %></td>
          </tr>
   </table>
			</form>
		</body>

	</html>