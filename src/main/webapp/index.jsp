<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
					<input type="submit" value="Submit"/>
						
				</div>
				
				</form>
				 <% 
   double num = Math.random();
   if (num > 0.95) {
   %>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
   <%
   } else {
   %>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
   <%
   }
   %>
   <a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
				
				
</body>
</html>