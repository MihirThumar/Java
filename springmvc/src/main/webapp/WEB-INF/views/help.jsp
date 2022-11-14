<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>    

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

		<%		
// 			String name = (String)request.getAttribute("name");
// 			Integer Id = (Integer)request.getAttribute("ID");
// 			LocalDateTime time =(LocalDateTime) request.getAttribute("time");
		%>
	
		<h1>This is help Page</h1>
		
		<h1>Hello, My name is  ${name }
<%-- 		<%= name %> --%>
		</h1>
		
		<h1>My id is 	${ID }
<%-- 		<%= Id %> --%>
		</h1>
		  
		 <h1>Date & Time is ${time }
<%-- 		 <%=time.toString() %> --%>
		 </h1>
		<hr>
		
		<c:forEach var="xyz" items="${marks }">
			<h1>${xyz }</h1>
		</c:forEach>
		
</body>
</html>