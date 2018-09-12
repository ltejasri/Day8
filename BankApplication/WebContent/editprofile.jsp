<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<h1>Edit Profile Form</h1>
<br>
<form action="editprofile" method="post">
<label>username:</label>
<input type="text" name="username" size="15"/>
<label>old password:</label>
<input type="password" name="oldpass" size="15"/>
<label>new password:</label>
<input type="password" name="newpass" size="15"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>