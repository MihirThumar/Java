<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>

<%@ include file="all_css_js.jsp"%>

</head>
<body>

	<div class="container">

		<%@ include file="navbar.jsp"%>

		<h1>Please Fill your note detail</h1>

		<!-- Form Page -->

		<form action="SaveNote" method="post">
			<div class="mb-3">
				<label for="title" class="form-label">Note Title </label> <input
					name="title" type="text" required class="form-control" id="title"
					placeholder="Enter Here Title" />

			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea name="content" class="form-control" id="content" required
					placeholder="Enter Your Content here" style="height: 15em;"></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>

		</form>

	</div>


</body>
</html>