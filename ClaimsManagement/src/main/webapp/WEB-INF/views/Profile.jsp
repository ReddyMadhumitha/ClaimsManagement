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
<title>Profile Updation</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Profile Page</h1>
		<form:form action="profile" method="post" modelAttribute="profile">
			<table border=1>
				<tr>
					<td>First Name</td>
					<td><form:input type="text" path="firstName"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input type="text" path="lastName"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><form:input type="number" path="age"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:input type="text" path="gender"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Status</td>
					<td><form:input type="text" path="status"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input type="text" path="contactNumber"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>User Id</td>
					<td><form:input type="number" path="userId"
							style="width: 120px" /></td>
				</tr>
			</table>
			<input type="submit" value="Update">
		</form:form>
		<br></br>
	</div>
</body>
</html>