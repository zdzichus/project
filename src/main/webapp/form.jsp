<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html><link rel="stylesheet" type="text/css" href="bootstrap.css">  
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Features</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<head>
<meta charset="UTF-8">

<title></title>
</head>
<body>
<h1>Simple Form</h1>
			<h2>Entry details: </h2>
				<form method ="get" action="addressBookServlet">
				  <div class="form-group has-success">
				    <label class="form-control-label" for="inputSuccess1">Name</label>
                    <input type="text" name="firstName" class="form-control is-valid" id="inputValid"> <br>
				
				     <label class="form-control-label" for="inputSuccess1">Surname</label>
                     <input type="text" name="Surname" class="form-control is-valid" id="inputValid"> <br>
                    
                      <label class="form-control-label" for="inputSuccess1">Phone</label>
                     <input type="text" name="Phone" class="form-control is-valid" id="inputValid"> <br>
                     
                       <label class="form-control-label" for="inputSuccess1">City</label>
                     <input type="text" name="City" class="form-control is-valid" id="inputValid"> <br>
                     
                       <label class="form-control-label" for="inputSuccess1">Country</label>
                     <input type="text" name="Country" class="form-control is-valid" id="inputValid"> <br>
                     
				<!--  
				Name <input type="text" name="firstName"> <br>
				Surname <input type="text" name="surname"> <br> 
				Phone <input type="text" name="phone"> <br>
				City <input type="text" name="city"> <br>
				Country <input type="text" name="country"> <br> -->  
				  </div>
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