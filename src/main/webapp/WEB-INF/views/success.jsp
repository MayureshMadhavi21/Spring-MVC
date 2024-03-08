<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  handling form using @RequestParam 
	<h1>${email}</h1>
	<h1>${userName}</h1>
	<h1>${password}</h1> -->
	<h1 class="text-center">${ Header }</h1>
	<p class="text-center">${ desc }</p>
	<h1 style="color: green">${ msg }</h1>
	<h3>Welcome, ${ user.userName }</h3>
	<h3>Your email address is ${ user.email }</h3>
	<h3>Your password is ${ user.password }</h3>
</body>
</html>