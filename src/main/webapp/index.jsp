<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<a href="../" class="navbar-brand">Bootswatch</a>
		<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-primary">
			<a class="navbar-brand" href="#">Application</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarColor01" aria-controls="navbarColor01"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Features</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">About</a></li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="text"
						placeholder="Search">
					<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>

		<meta charset="UTF-8">
		<title>Application</title>
	</div>
	<div class="container">

		<h1>Simple Form</h1>
		<h2>Entry details:</h2>
		<form method="get" action="addressBookServlet">
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Name</label> <input
					type="text" name="firstName" class="form-control"><br>
				<label class="col-form-label" for="inputDefault">Surname</label> <input
					type="text" name="surname" class="form-control"><br> <label
					class="col-form-label" for="inputDefault">Phone</label> <input
					type="text" name="phone" class="form-control"><br> <label
					class="col-form-label" for="inputDefault">City</label> <input
					type="text" name="city" class="form-control"><br> <label
					class="col-form-label" for="inputDefault">Country</label> <input
					type="text" name="country" class="form-control"><br>
			</div>
			<div class="form-group">
				<div class="custom-control custom-radio">
					<input type="radio" id="male" name="gender" value="Male"
						class="custom-control-input"> <label
						class="custom-control-label" for="customRadio1">Male</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="female" name="gender" value="Female"
						class="custom-control-input"> <label
						class="custom-control-label" for="customRadio1">Female</label>
				</div>
			</div>

			<div>
				<button type="submit" class="btn btn-primary">Submit</button>

			</div>
		</form>
	</div>
</body>
</html>