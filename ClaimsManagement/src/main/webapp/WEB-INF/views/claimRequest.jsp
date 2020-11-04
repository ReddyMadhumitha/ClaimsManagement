<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
	background-image: url('/bg.png');
}
</style>
<title>Claim Request</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Claim Request Page</h1>
		<form:form action="claimrequest" method="post" modelAttribute="claimreq">
			<table border=1>
				<tr>
					<td>Claim Information</td>
					<td><form:textarea  path="claimInformation"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Reason</td>
					<td><form:textarea  path="reason"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Member Id</td>
					<td><form:input type="number" path="memberId"
							style="width: 120px" /></td>
				</tr>
				
				<tr>
					<td>Status</td>
					<td><form:input type="text" path="status"
							style="width: 120px" /></td>
			</table>
			<input type="submit" value="Request">
		</form:form>
		<br></br>
	</div>
</body>
</html>