<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int count = 0;%>
	<h2>Welcome user. Current time <%= new Date() %></h2>
	<br>
	<div>
	some message
	</div>
	<hr>
	<% count++; %>
	<div>This page is a number: <%= count %></div>
</body>
</html>