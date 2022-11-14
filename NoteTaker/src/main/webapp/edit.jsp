<%@page import="com.entities.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update : Note taker</title>

<%@ include file="all_css_js.jsp"%>


</head>
<body>

	<div class="container">

		<%@ include file="navbar.jsp"%>
		<br>
		<h1>Edit your Note </h1>
		<br>

		<%
						
						int noteId = Integer.parseInt(request.getParameter("note_id").trim());
						Session s = FactoryProvider.getFactory().openSession();
						
						Note note = s.get(Note.class, noteId);
						
						%>

		<form action="UpdateServlet" method="post">
		
			<input value="<%= note.getId() %>" name="noteId" type="hidden">
			
				<div class="mb-3">
				<label for="title" class="form-label">Note Title </label> 
				<input name="title" 
				type="text" 
				required class="form-control" 
				id="title"
				placeholder="Enter Here Title"
				value="<%=note.getTitle() %>"
				 />

			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea name="content" 
				class="form-control" 
				id="content" required
				placeholder="Enter Your Content here" 
				style="height: 15em;">
				<%= note.getContent() %>
				</textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Update</button>
			</div>


	</form>

				

	</div>

</body>
</html>