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
				 
							 
				Gender <input type="text" name="select" value ="<% "select" %>">
				Surname <input type="text" name="surname" value = "<% "surname" %>">
				Phone <input type="text" name="phone" value = ""<% "phone" %>"">
				
			</form>
						
		</body>

	</html>