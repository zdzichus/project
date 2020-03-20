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
			  <table border=1 cellpadding=3 cellspacing=0>
        <tr>
          <th>Gender</th>
          <th>Surname</th>
          <th>Phone</th>
          <th>xx</th>
        </tr>
          <tr>
            <td><%= request.getParameter("select") %></td>
            <td><%= request.getParameter("Surname") %></td>
            <td><%= request.getParameter("phone") %></td>
            <td><%= rset.getInt("XXXX") %></td>
          </tr>
   </table>
			<form action="addressbook" method="POST">
				 
							 
				Gender <input type="text" name="select" value = "select">
				Surname <input type="text" name="surname" value = "kicha1">
				Phone <input type="text" name="phone" value = "phone">
				
			</form>
		</body>

	</html>