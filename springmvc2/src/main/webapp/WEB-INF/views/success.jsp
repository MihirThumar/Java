	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h1>${Header }</h1>
			<h2>${Desc }</h2>
			<h1 style="color:green">${msg }</h1>
			<hr>
	<h3>Welcome , ${user.userName }</h3>
	<h3>Your Email address ${user.email }</h3>
	<h3>Your password ${user.password } </h3>
			
</body>
</html>