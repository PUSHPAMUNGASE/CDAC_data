<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<%-- Obtaining user name from Session scop against the name: loggedInUser --%>

	<% 
		Object loggedInUserName = session.getAttribute("loggedInUser");
	%>
	<h1 style = "background-color: green; color: white;">
		hey <%=loggedInUserName %> Congratulations.. You Are In 
	</h1>
</body>
</html>