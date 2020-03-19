<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
	<html>
		<head>
		<meta charset="UTF-8">
		<title></title>
        <link rel="stylesheet" type="text/css" href="style.css">	
		</head>
			<body>
			<h2>Enter:</h2>
			<form action="addressbook" method="POST">
				 
				<input type="text" name="select" />
				<input type="text" name="surname" />
				
				
			</form>
			
			 PrintWriter out = response.getWriter();
          	  out.println("<html>");
          	  out.println("<head>");
          	  out.println("<meta charset=\"UTF-8\">");  
          	  out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">"); 
          	  out.println("</head>");
          	  		out.println("<body>");
          	  		out.println("<li> Surname: "+ request.getParameter("surname")+ "\n");
          	  		out.println("<li> Gender: "+ request.getParameter("gender")+ "\n");  	  		
          	  		out.println("</body>");
          	  out.println("</html>");
          	  out.close();
			
		</body>

	</html>