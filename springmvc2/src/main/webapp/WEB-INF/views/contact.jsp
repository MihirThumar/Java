<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MVC demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body>

	<div class="container mt-5">

		<h2 class="text-center">${Header}</h2>
		<h6 class="text-center">${Desc}</h6>

		<form action="processform" method="post">

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> 
					<input type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					placeholder="Enter your Email" name="email">
				<div id="emailHelp" class="form-text">We'll never share your
					email with anyone else.</div>
			</div>

			<div class="mb-3">
				<label for="userName" class="form-label">User Name</label> 
				<input
					type="text" class="form-control" name="userName" id="userName"
					placeholder="Enter your user name">
			</div>

			<div class="mb-3">
				<label for="userPassword" class="form-label">User Password</label> 
				<input
					type="password" class="form-control" name="password"
					id="userPassword" placeholder="Enter your Password">
			</div>

			<div class="container text-center">
				<button type=submit class="btn btn-success ">Sign up</button>
			</div>

		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>