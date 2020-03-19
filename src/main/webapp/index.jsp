<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dzidek</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
<h1>Simple Form</h1>
			<h2>Entry details: </h2>
				<form method ="post" action="addressBookServlet">
				Name <input type="text" name="firstName"> <br>
				Surname <input type="text" name="surname"> <br> 
				Phone <input type="text" name="phone"> <br>
				City <input type="text" name="city"> <br>
				Country <input type="text" name="country"> <br>
				
				<div>
					<input type="radio" id="male" name="gender" value="Male"><label for="male">Male</label>
					<input type="radio" id="female" name="gender" value="Female"><label for="female">Female</label>
				</div>
				
				<div>
					<input type="submit" value="Submit">
						
				</div>
				
				</form>
</body>
</html>