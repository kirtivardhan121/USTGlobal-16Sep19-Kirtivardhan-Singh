<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>change Password</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
	<fieldset>
		<legend>Change Password</legend>
		<form action="./changePassword" method="post">
		<h4><%=msg%></h4>
			<table>
				<tr>
					<td><a href="./home"> Home </a></td>
				</tr>
				<tr>
					<td><a href="./logout">Logout</a> </td> 
				</tr>
				<tr>
				<td> New password : </td>
					<td><input type="password" name="pwd"> </td>
				</tr>
				<tr>
					<td> Confirm password : </td>
					<td><input type="password" name="cnfpwd"></td>
				</tr>
				<tr>
					<td><input type="submit" name="change"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>