<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<h3>What is the code?</h3>
	<c:out value="${ error }"/>
	
	<form action="/code" method="post">
		
		<input type="text" name="code">
		<input type="submit" value="Try Code">
	
	</form>

</body>
</html>