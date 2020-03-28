<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
<link rel="stylesheet" type="text/css" href="bootstrap.css">  
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

<title>Main</title>
</head>
<body>
<div class="jumbotron">
<div class="card border-primary mb-3" style="max-width: 30rem;">
  <div class="card-header">Simple Form</div>
  <div class="card-body">
    <h4 class="card-title">Entry details:</h4>
    	<form method ="get" action="addressBookServlet">
				  
			  <div class="form-group">
				    <label class="form-control-label" for="inputSuccess1">Name</label>
                    <input type="text" name="firstName" class="form-control"> <br>
				
				     <label class="form-control-label" for="inputSuccess1">Surname</label>
                     <input type="text" name="surname" class="form-control" > <br>
                    
                      <label class="form-control-label" for="inputSuccess1">Phone</label>
                     <input type="text" name="phone" class="form-control" > <br>
                     
                       <label class="form-control-label" for="inputSuccess1">City</label>
                     <input type="text" name="city" class="form-control" > <br>
                     
                       <label class="form-control-label" for="inputSuccess1">Country</label>
                     <input type="text" name="country" class="form-control" > <br>
                 </div>
  						
  						<div class="form-group">
   						
   						 <div class="custom-control custom-radio">
      					 <input type="radio" id="male" name="gender" value="Male" class="custom-control-input">
     					 <label class="custom-control-label" for="male">Male</label>
    					 </div>
    					
   						 <div class="custom-control custom-radio">
     					 <input type="radio" id="female" name="gender" value="Female" class="custom-control-input">
     					 <label class="custom-control-label" for="female">Female</label>
   						 </div>
   						
   						 </div>	
  				
				
				<div>
				    <button type="submit" class="btn btn-primary">Submit</button>
					<!-- <input type="submit" value="Submit">  -->
						
				</div>
		</form>
		</div>	
  </div>	
</div>
</body>
</html>