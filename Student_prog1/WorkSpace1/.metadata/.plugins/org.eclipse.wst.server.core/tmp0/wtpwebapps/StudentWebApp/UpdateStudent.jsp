<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Student</title>
</head>
<body>
   
   <jsp:include page="TCHomePage.jsp" />
	
	
	<form action="UpdateStudent" method="post">

	<table align="center">
		<tr>
			<td>stdId</td>
			<td><input type="text" name="stdId" value="${std.stdId}" readonly/></td>
		</tr>
		<tr>
			<td>stdName</td>
			<td><input type="text" name="stdName" value="${std.stdName}" /></td>
		</tr>
		<tr>
			<td>Batch</td>
			<td><input type="text" name="batch" value="${std.batch}" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<select name="gender">
					<option value="${std.gender}" selected>${std.gender}</option>
					<option value="Male">Male</option>
					<option value="Female">Female</option>
					<option value="Others">Others</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>EmailId</td>
			<td><input type="text" name="emailId" value="${std.emailId}" readonly /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="${std.password}" readonly/></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<button>Update Student</button>
			</td>
		</tr>
	</table>
</form>
	
</body>
</html>