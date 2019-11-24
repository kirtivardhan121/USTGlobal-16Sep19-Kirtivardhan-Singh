<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<%
	String id = "";
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie cookie : cookies) {

			if (cookie.getName().equals("alwaysRemember")) {

				id = cookie.getValue();
			}
		}
	}
%>


<body>
	
	<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>
		<h4 style="color: red;"><%=msg%></h4>
			<table>
				<tr>
					<td>Id:</td>
					<td><input type='text' name='id' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td><input type='checkbox' name='rememberme' value='checked'></td>
					<td>Remember me</td>
				</tr>
				<tr>
					<td><input type='submit' value='Login'></td>
				</tr>
				<tr>
					<td><a href='register.html'> Register </a></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>