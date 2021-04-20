<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
String errmsg = (String) request.getAttribute("errmsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employee Details</title>
</head>
<body>

	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h1><%=msg%></h1>
	<%
	}
	%>

	<%
	if (errmsg != null && !errmsg.isEmpty()) {
	%>
	<h1><%=errmsg%></h1>
	<%
	}
	%>
	<fieldset>
		<legend>ADDING EMP</legend>

		<form action="./add" method="post">
			<table>
				<tr>
					<td>ID</td>
					<td>:</td>
					<td><input type="text" placeholder="enter ID"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td>:</td>
					<td><input type="text" placeholder="enter Name"></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td>:</td>
					<td><input type="text" placeholder="enter DOB"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" placeholder="enter password"></td>
				</tr>



			</table>

		</form>
		<tr>
			<input type="submit" value="Add">
		</tr>
	</fieldset>
</body>
</html>