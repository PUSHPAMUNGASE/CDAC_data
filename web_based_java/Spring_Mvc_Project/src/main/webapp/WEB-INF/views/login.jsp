<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body bgcolor="cyan">
		<h1>Sign-In</h1>
		<form action="doValidate" method="post">
			<h2>User Name</h2>
			<input type="text" name="uId" style="background-color: yellow;color: blue;font-size: 18pt">
				
			<h2>Password</h2>
			<input type="text" name="pwd" style="background-color: yellow;color: blue;font-size: 18pt">
			
			<div style="margin-top: 20px;">
				<input type="submit" value="SignIn">
			</div>
			
		</form>
	</body>
</html>