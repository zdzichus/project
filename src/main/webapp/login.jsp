<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
  <link rel="stylesheet" type="text/css" href="style.css">	
</head>
<body>
<h1>Login:</h1>
			<h2>Entry details: </h2>
				<form method ="get" action="loginBookServlet">
				Login <input type="text" name="login"> <br>
				Password <input type="text" name="password"> <br> 
											
				<div>
					<input type="submit" value="Login">
						
				 </div>
				</form>

</body>
</html>